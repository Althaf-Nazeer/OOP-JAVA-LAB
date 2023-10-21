import java.util.Scanner;;

class myCheckedException extends Exception {
    myCheckedException(String s) {
        super(s);

    }
}

public class ExceptionHandling {

    static void divide() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two Numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + "/" + b + "= " + a / b);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }

    static void testFunction() {
        try {
            System.out.println("Hello, I will now throw an Exception");
            throw new myCheckedException("This is an Exception");
        } catch (myCheckedException e) {
            System.out.println("Caught Excpetion: " + e);
        }
    }

    static void testFunction2() throws myCheckedException {
        System.out.println("\n I will now throw an Exception too, except, I wont handle it!");
        throw new myCheckedException("Another Exception");

    }

    public static void main(String[] args) {
        divide();
        testFunction();
        try {
            testFunction2();
        } catch (myCheckedException e) {
            System.out.println("Caught the Exception: " + e);
        }
    }
}
