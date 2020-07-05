package TrabalhoPO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Arquivo {

    public static void write(String[] vet, String filename) throws IOException {

        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);

        for (String string : vet) {
            writer.println(string);
        }

        writer.close();
    }

    public static String[][] read(String filename) throws IOException {

        String[][] result;
        
        File file = new File(filename);
        Scanner scan = new Scanner(file);

        Path path = Paths.get(filename);
        int count = (int) Files.lines(path).count();

        result = new String[count][];

        String[] arrayLine;

        for (int i = 0; i < count; i++) {
            arrayLine = scan.nextLine().split(";");        
            result[i] = arrayLine;
        }

        scan.close();

        return result;
    }
}