package hust.soict.hedspi.aims.disc;
import hust.soict.hedspi.aims.media.*;

public class Disc extends Media {
	private int length;
	private String director;
	
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
	
	public Disc(String title, int length, String director) {
		super(title);
		this.length = length;
		this.director = director;
	}

	public Disc(String title, String director) {
		super(title);
		this.director = director;
	}

	public Disc(String title, int length) {
		super(title);
		this.length = length;
	}
	
	public Disc() {
		
	}
}
