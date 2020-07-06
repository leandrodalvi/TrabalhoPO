package TrabalhoPO; 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileManager {

    public static void write(Item[] items, String filename) throws IOException {

        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);

        for ( int i = 0 ; i < items.length ; i++) {
        	writer.println(items[i].toString());
        }

        writer.close();
    }
    
    public static void writeString(String s, String filename) throws IOException {

        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);

        writer.println(s);

        writer.close();
    }

    
    
    public static Item[] read(String filename) throws IOException {

        Item[] result;
        
        File file = new File(filename);
        Scanner scan = new Scanner(file);

        Path path = Paths.get(filename);
        int count = (int) Files.lines(path).count();

        result = new Item[count];

        String[] arrayLine;
        long cpf,subscription;
        float value;
        boolean paid;

        for (int i = 0; i < count; i++) {
            arrayLine = scan.nextLine().split(";");    
            cpf = Long.parseLong(arrayLine[0]);
            subscription = Long.parseLong(arrayLine[1]);
            value = Float.parseFloat(arrayLine[2]);
            paid = (arrayLine[3].equalsIgnoreCase("true")) ? true : false;
            result[i] = new Item(cpf, subscription, value, paid);
        }

        scan.close();

        return result;
    }
    


    
    public static long[] readInputFile() {

       
        File file = new File("imovel400.txt");
        Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        long[] result = new long[400];

        String[] arrayLine;
        long cpf,subscription;
        float value;
        boolean paid;

        for (int i = 0; i < 400; i++) {
           result[i] = Long.parseLong(scan.nextLine());
        }

        scan.close();

        return result;
    }
}