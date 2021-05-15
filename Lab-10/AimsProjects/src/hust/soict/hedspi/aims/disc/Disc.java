package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc() {
        super();
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public Disc(String id, String title, float cost) {
        super(id, title, cost);
    }

    public Disc(String id, String title, int length, float cost) {
        super(id, title, cost);
        this.length = length;
    }

    public Disc(String id, String title, String category, int length, float cost ) {
        super(id, title, cost);
        this.length = length;
    }

    public Disc(String id, String title, String category, int length, String director, float cost) {
        this(id, title, category, length, cost);
        this.director = director;
    }

	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
