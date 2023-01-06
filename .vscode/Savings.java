import java.util.*;

public class Savings {
    // method to calculate simple interest
    void interest(double principal, double rate, double time) {
        double interest = principal * rate * time / 100;
        System.out.println("Your simple interest is: " + interest);
    }

    public static void main(String[] args) {
        // test the interest method
        Savings obj = new Savings();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();
        System.out.println("Enter the rate for interest: ");
        double rate = sc.nextDouble();

        obj.interest(principal, rate, time);
    }
}