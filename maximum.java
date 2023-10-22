import java.io.*;
import java.util.Scanner;
public class Maximum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,k,max=0,i;
		System.out.print("Enter the number of terms : ");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter number :");
			k=in.nextInt();
			if(k>max)
				max=k;			
		}
		System.out.println("Maximum : " + max);
	}
}
