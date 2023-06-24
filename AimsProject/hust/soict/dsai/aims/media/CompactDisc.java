package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;


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
    public void play() {
        for (int i=0;i<tracks.size();i++){
            tracks.get(i).play();
        }
    }
    public String toString(){
        return "cd"+"-"+this.getArtist()+"-"+this.getDirector()+"-"+ this.getTitle() + " - " + this.getCategory()+"-"+this.getLength()  + " :"  + this.getCost() + " $";
    }
}
