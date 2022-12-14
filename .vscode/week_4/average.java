package week_4;
import java.util.*;

public class average {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        int avg= 0;
        int[] physics={45,46,43,44,47,45,34,35};
        for ( int marks:physics){
            sum+=marks;
            count=count+1;
        }
        avg= sum/count;
        System.out.println("Th average marks from an array containing marks of all students in physics is " +avg );
    } 
}
