import java.io.*;
import java.util.*;
class CreateFile{
    public static void main(String[] args) {
        File obj=new File("Hello.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
