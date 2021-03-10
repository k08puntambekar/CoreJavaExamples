package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FHTryWithResource {

    public static void main(String[] args) {


        try(FileWriter fileWriter = new FileWriter("F:\\Core JAVA codekul\\src\\filehandling\\DemoFile2.txt")) {

            fileWriter.write("This is FileReader and FileWriter Example using Try with Resource");

            System.out.println("File written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader("F:\\Core JAVA codekul\\src\\filehandling\\DemoFile2.txt")) {

            int i = fileReader.read();

            while(i>0) {
                System.out.print((char)i);
                i = fileReader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
