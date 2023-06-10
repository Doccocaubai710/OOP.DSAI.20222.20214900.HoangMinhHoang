package hust.soict.dsai.aims.media;

import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks;
    public String getArtist(){
        return artist;
    }
    public CompactDisc(){
        super();
    }
    public CompactDisc(int id,String title,String category, float cost,String artist,int length,String director){
        super(id, title, category, cost, length, director);
        this.artist=artist;
        this.tracks=new ArrayList<Track>();
    }
    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }
    }
    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
        }
    }
    public int getTrackLength(){
        int sum=0;
        for (int i=0;i<tracks.size();i++){
            sum+=tracks.get(i).getLength();
        }
        return sum;
    }
    @Override
    public void play() {
        for (int i=0;i<tracks.size();i++){
            tracks.get(i).play();
        }
    }
    public String toString(){
        return "cd"+"-"+this.getArtist()+"-"+this.getDirector()+"-"+ this.getTitle() + " - " + this.getCategory()  + " :"  + this.getCost() +"-"+this.getTrackLength()+ " $";
    }
}
