package hust.soict.hedspi.aims.disc;


public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    
    public boolean equals(Object O) {
		if(O instanceof Track) {
			Track newTrack = (Track) O;
			return (newTrack.getTitle() ==this.getTitle()&&
					newTrack.getLength()==this.getLength())?true:false;
		}
		return false;
	}
    
	public int compareTo(Track track) {
		if(track instanceof Track) {
			return this.getTitle().compareTo(track.getTitle());
		}
		System.out.println("There was an errror");
		return 0;
	}
}