package hust.soict.hedspi.garbage;

import java.io.File;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
        File file = new File("src/hust/soict/hedspi/fileText/textTest.txt");
        try {
            Scanner scan = new Scanner(file);
            String s = "";
            while(scan.hasNextLine()) {
                s += scan.nextLine();
            }
            scan.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}