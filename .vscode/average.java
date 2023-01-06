import java.util.*;

public class average {
    static double findaverage(int a, int b, int c){
        double sum =(double) (a+b+c)/3.0;
        return sum;
    }
    public static void main(String[] args) {
        double average = findaverage(32,44, 34);
        System.out.printf("The average for the three numbers is: %.2f \n", average);
    }
}
