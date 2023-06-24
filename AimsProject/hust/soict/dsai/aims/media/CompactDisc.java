package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hust.soict.dsai.aims.exception.PlayerException;


public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks;
    public String getArtist(){
        return artist;
    }
    public CompactDisc(){
        super();
    }
    public CompactDisc(int id,String title,String category, float cost,String artist,String director,ArrayList<Track> tracks){
        super(id, title, category, cost, 0, director);
        this.artist=artist;
        this.tracks=tracks;       
        calculateLength();
    }
    public void setTrack(ArrayList<Track>tracks) {
    	this.tracks=tracks;
    }
    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
            setLength(getLength() + track.getLength());
        }
    }
    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
            setLength(getLength() - track.getLength());
        }
    }
    public void calculateLength(){
        int sum=0;
        for (int i=0;i<tracks.size();i++){
            sum+=tracks.get(i).getLength();
        }
        setLength(sum);
    }
    @Override
    public void play() throws PlayerException {
    	
        if (this.getLength()>0) {
        	java.util.Iterator iter=tracks.iterator();
        	Track nextTrack;
        	while (iter.hasNext()) {
        		nextTrack=(Track) iter.next();
        		try {
        			nextTrack.play();
        		}catch (PlayerException e) {
					// TODO: handle exception
        			throw e;
				}
        	}
        } else throw new PlayerException("ERROR: CD length is non-positive");
    }
    public String toString(){
        return "cd"+"-"+this.getArtist()+"-"+this.getDirector()+"-"+ this.getTitle() + " - " + this.getCategory()+"-"+this.getLength()  + " :"  + this.getCost() + " $";
    }
}
