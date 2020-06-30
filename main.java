package TrabalhoPO;
import java.io.*;

public class Main{
    public static void main(){
        try{
            FileWriter writer = new FileWriter("HeapAle.txt");
            writer.write("");
        }catch(IOException e){
            System.out.println("Error with File Writing");
        }

    }
}