import java.io.*;
import java.util.Scanner;
public class Frequency
{
	public static void main(String args[])
	{
		String str,str1;
		char c;
		Scanner in=new Scanner(System.in);
		int l,i,count=0;
		System.out.println("Enter the string");
		str=in.nextLine();
		str1=str.toLowerCase();
		System.out.println("Enter the character");
		c=in.next().charAt(0);
		l=str.length();
		for(i=0;i<l;i++)
		{
			if(str1.charAt(i)==c)
				count++;
		}
		System.out.println("Frequency of character "+c+" = "+count);
		}
}
