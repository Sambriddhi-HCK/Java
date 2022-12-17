package week_4;
import java.util.*;

public class average {
    public static void main(String[] args) {
        double sum=0;
        double avg= 0.00;
        int[] physics={45,46,43,44,47,45,34,35};
        for ( int marks:physics){
            sum+=marks;
        }
        avg= sum/physics.length;
        System.out.println("The average marks from an array containing marks of all students in physics is " +avg );
    } 
}
