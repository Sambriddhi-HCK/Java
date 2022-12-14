package week_4.ww4;
import java.util.*;

public class integ {
    public static void main(String[] args) {
        int[] numbers={2,3,45,64,52,6,778,4};
        int tofind = 46;
        boolean found = false;
        for (int n:numbers){
            if (n==tofind){
                found=true;
                break;
            }
        }
        if (found) 
        System.out.println(" The integer is present");
        else
        System.out.println(" The integer is not present");
    }
}
    