import java.util.*;

public class Calculator {
    // declaring instance variables
    double a;
    double b;
    Scanner sc;

    // constructor
    Calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
    }

    // Method to print sum
    void printSum() {
        double s = a + b;
        System.out.println("The sum of the two numbers are " + s);
    }

    // Method to print sum
    void printDifference() {
        double d = a - b;
        System.out.println("The difference between the two numbers are " + d);
    }

    // Method to print sum
    void printProduct() {
        System.out.println("The product of the two numbers are " + (a * b));
    }

    // Method to print sum
    void printQuotient() {
        System.out.println("The quotient of the two numbers are " + (a / b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.sc = new Scanner(System.in);
        while (true) {
            // Printing the options
            System.out.println("Enter the preceding numbers to print the following options");
            System.out.println("1.Sum");
            System.out.println("2.Difference");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            int choosedoption = c.sc.nextInt();
            if (choosedoption == 1) {
                c.printSum();
            } else if (choosedoption == 2) {
                c.printDifference();
            } else if (choosedoption == 3) {
                c.printProduct();
            } else if (choosedoption == 4) {
                c.printQuotient();
            } else {
                System.out.println("Invalid option");
            }
            System.out.println("Do you want to perform another operation? Enter y if yes");
            String choosed = c.sc.next();
            if (!choosed.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
