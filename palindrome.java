import java.util.*;
public class Palindrome {
    public static void main(String arg[]) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the string to compare");
        String str=Sc.nextLine();
        int n=str.length();
        int flag=0;
        int j=n-1;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                flag=1;
                break;
            }
            j=j-1;
        }
        if(flag==1){
            System.out.println("Not palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
}
