import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args) {
        final String path = "Output.txt";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            int ch;
            String data = "";
            while ((ch = fis.read()) != -1) {
                data += (char) ch;
            }
            if (data != "")
                System.out.println("File contents : " + data);
            else
                System.out.println("File Empty");
        } catch (FileNotFoundException e) {
            System.out.println("File does not already exist.");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        Scanner sc = null;
        FileOutputStream fout = null;
        try {
            sc = new Scanner(System.in);
            fout = new FileOutputStream(path);
            System.out.print("Enter a string to save: ");
            String data = sc.nextLine();
            byte b[] = data.getBytes();
            fout.write(b);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (sc != null)
                    sc.close();
                if (fout != null)
                    fout.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
