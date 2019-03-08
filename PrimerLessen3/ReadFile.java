package PrimerLessen3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("C:\\testFolder\\testFile.txt");
        Scanner sc = null;

        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
