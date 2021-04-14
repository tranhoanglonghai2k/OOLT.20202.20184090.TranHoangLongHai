package hust.soict.hedspi.aims.disc;
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
}
