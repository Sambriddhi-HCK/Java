package week_4;

import java.util.*;

public class errorfix1 {
    public static void main(String[] args) {
        int num;
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to conitnue the program or 0 to stop");
        num = sc.nextInt();
        while (num != 0) {
            product = product * num;
            System.out.println("Enter a number to continue the program or 0 to stop");
            Scanner Integer = new Scanner(System.in);
            num = Integer.nextInt();

        }
        System.out.println(" The producct of numbers is " + product);

    }
}
