import java.io.*;
import java.util.Scanner;
public class Area
{
    float r,l,b,a,c,d,s;
    double area1,area2,area3;
    void area(float r)
    {
        area1=3.14*r*r;
        System.out.println("Area of circle : "+area1);
    }
    void area(float l,float b)
    {
        area2=l*b;
        System.out.println("Area of rectangle : "+area2);
    }
    void area(float a,float c,float d)
    {
        s=(a+c+d)/2;
        area3=Math.sqrt(s*(s-a)*(s-d)*(s-c));
        System.out.println("Area of triangle : "+area3);
    }
    public static void main(String args[])
    {
        float r,l,b,a,c,d;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r=in.nextFloat();
        System.out.println("Enter the length of rectangle");
        l=in.nextFloat();
        System.out.println("Enter the breadth of rectangle");
        b=in.nextFloat();
        System.out.println("Enter the sides of the triangle");
        a=in.nextFloat();
        c=in.nextFloat();
        d=in.nextFloat();
        Area ob=new Area();
        ob.area(r);
        ob.area(l,b);
        ob.area(a,c,d);
    }
} 
