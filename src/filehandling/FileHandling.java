package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {



//        F:\Core JAVA codekul\src\filehandling
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\Core JAVA codekul\\src\\filehandling\\DemoFile.txt");
        String s = "Hello everyone!";
        byte[] arr = s.getBytes();
        fileOutputStream.write(arr);

        System.out.println("File created and written...");

        FileInputStream fileInputStream = new FileInputStream("F:\\Core JAVA codekul\\src\\filehandling\\DemoFile.txt");
        int i = fileInputStream.read();
        System.out.println(i);
        while (i > 0) {
            System.out.print((char)i);

            i = fileInputStream.read();
        }

    }
}
