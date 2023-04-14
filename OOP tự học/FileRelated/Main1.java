import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("poem.txt");
            writer.write("Rose are red\nViolets are blue\nBooty Booty Booty");
            writer.append("\n(A poem by me)");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }    
}
