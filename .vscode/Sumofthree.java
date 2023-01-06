import java.util.*;

public class Sumofthree {

    // method to find sum of three numbers
    static int findsum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        int sum = findsum(12, 23, 34); //calling findsum method
        System.out.print("The sum of the three numbers is: " + sum +"  ");
    }
}
