import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\DSA-kk\\src\\Example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
