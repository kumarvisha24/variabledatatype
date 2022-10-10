
import java.util.*;

class ArithmeticOp {
    public static void main(String[] arg) {
        double a;
        double b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First number:");
        a = obj.nextDouble();
        System.out.println("Enter Second number:");
        b = obj.nextDouble();

        System.out.println("The addition of two numbers is " + (a + b));

        System.out.println("The Subtraction of two number is  " + (a - b));

        System.out.println("The Multipliction of two number is " + (a * b));

        System.out.println("The Division OF two number is " + (a / b));
        System.out.println("The modulous of two number is " + (a % b));
    }
}