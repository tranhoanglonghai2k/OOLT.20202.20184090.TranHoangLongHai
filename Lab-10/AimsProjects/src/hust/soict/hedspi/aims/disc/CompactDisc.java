package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.exceptions.PlayerException;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks;
	private String message;

	public CompactDisc(String title, String category, float cost, int length, String director, String artist,
			ArrayList<Track> tracks) {
		super();
		setArtist(artist);
		setTracks(tracks);
	}

	public CompactDisc(String title, String caterogy, float cost) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String caterogy) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title) {
		super(title, title, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String artist, ArrayList<Track> tracks) {
		super(title, artist, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, float cost, String director, int length, String artist) {
		// TODO Auto-generated constructor stub
		super();
		setArtist(artist);

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Track> getTracks1() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks2) {
		this.tracks = tracks2;
	}

	public void addTrack(Track track) {
        if(tracks.contains(track)) {
            System.err.println("Track has been existed");
        }else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
        }else {
            System.err.println("Don't find track");
        }
    }

    @Override
    public void play() throws PlayerException {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        this.message = "Playing CD: " + this.getTitle() + "\nCD length: " + this.getLength();
        if(this.getLength() > 0) {
            for(Track track: tracks) {
                track.play();
                message += track.getMessage();
            }
//			show dialog
        }else {
            throw new PlayerException("ERROR: CD length is non-positive");
        }
    }

    public int compareTo(Media media) {
        if(media instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc)media;
            if(tracks.size() == cd.tracks.size()) {
                return Integer.compare(this.length, cd.getLength());
            }
            else if(tracks.size() < cd.tracks.size())
                return -1;
            else return 1;
        }else {
            return super.compareTo(media);
        }
    }


    public ArrayList<Track> getTracks() {
        return tracks;
    }
}