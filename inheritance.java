import java.util.*;
class Employee{
    String Name;
    int Age;
    int Phone;
    String Address;
    int Salary;
    public void printSalary(){
        System.out.println("Salary is="+Salary);
    }
}
class Officer extends Employee{
    String Spec;
}
class Manager extends Employee{
    String Department;
}
public class Inheritance {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Officer off=new Officer();
        Manager man=new Manager();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Enter the deatils of Officer");
        System.out.println("Enter the name");
        off.Name=sc.nextLine();
        System.out.println("Enter the age");
        off.Age=sc.nextInt();
        System.out.println("Enter the Phone Number");
        off.Phone=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Address");
        off.Address=sc.nextLine();
        System.out.println("Enter the Salary");
        off.Salary=sc.nextInt();
        System.out.println("Enter the Spec");
        off.Spec=sc.nextLine();
        off.printSalary();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Enter the deatils of manager");
        System.out.println("Enter the name");
        man.Name=sc.nextLine();
        System.out.println("Enter the age");
        man.Age=sc.nextInt();
        System.out.println("Enter the Phone Number");
        man.Phone=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Address");
        man.Address=sc.nextLine();
        System.out.println("Enter the Salary");
        man.Salary=sc.nextInt();
        System.out.println("Enter the Spec");
        man.Department=sc.nextLine();
        man.printSalary();
        System.out.println("----------------------------------------------------------------------");
    }
}
