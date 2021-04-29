package hust.soict.hedspi.aims.disc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;

    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String id, String title, String category, String artist, float cost) {
        super(id, title, cost);
        this.artist = artist;
        this.category = category;
    }

    public void addTrack(Track track){
        if(tracks.indexOf(track) == -1){
            tracks.add(track);
            System.out.println("Track has added!!!");
        }else{
            System.out.println("Track has been existed!!!");
        }
    }

    public void removeTrack(Track track){
        if(tracks.indexOf(track) != -1){
            tracks.remove(track);
            System.out.println("Track has deleted!!!");
        }else{
            System.out.println("Track hasn't exist!!!");
        }
    }
    
    public int getLength(){
        int sum=0;
        for(int i = 0;i<tracks.size();i++){
            sum = sum + tracks.get(i).getLength();
        }
        return sum;
    }
    
    public void play() {
        for(Track track: tracks) {
            System.out.println("Playing CD: " + track.getTitle() + "CD length: " + track.getLength());
        }
    }
    
    public int compareTo(Object obj) {
		if (obj instanceof CompactDisc) {
			CompactDisc tmp = (CompactDisc) obj;
			int result = this.getTitle().compareTo(tmp.getTitle());

			if (result < 0) {
				return -1;
			} else if (result == 0) {
				return 0;
			} else {
				return 1;
			}
		}
		return -2;
	}
}
