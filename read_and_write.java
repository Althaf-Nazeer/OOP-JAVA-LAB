import java.io.*;
import java.util.*;
public class ReadAndWrite {
    public static void main(String arg[]){
        try{
            FileWriter writer=new FileWriter("hello.txt");
            writer.write("My name adi");
            writer.close();
            System.out.println("File Created");
    

        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            File obj=new File("hello.txt");
            Scanner sc=new Scanner(obj);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
