package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks=new ArrayList<Track>();
    public String getArtist(){
        return artist;
    }
    public CompactDisc(){
        super();
    }
    public CompactDisc(int id,String title,String category, float cost,String artist){
        super(id, title, category, cost);
        this.artist=artist;
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
    public int getLength(){
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
        return "cd"+"-"+this.getArtist()+"-"+this.getDirector()+"-"+ this.getTitle() + " - " + this.getCategory()  + " :"  + this.getCost() +"-"+this.getLength()+ " $";
    }
}
