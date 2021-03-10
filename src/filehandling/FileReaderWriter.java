package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("F:\\Core JAVA codekul\\src\\filehandling\\DemoFile1.txt");
            fileWriter.write("This is FileReader and FileWriter Example");

            System.out.println("File written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileReader = new FileReader("F:\\Core JAVA codekul\\src\\filehandling\\DemoFile1.txt");
            int i = fileReader.read();

            while(i>0) {
                System.out.print((char)i);
                i = fileReader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}




