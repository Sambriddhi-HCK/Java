package week_4.ww4;

import java.util.*;
public class maximum {
    public static int maximum(int array[]) {
        Arrays.sort(array);
        int max = array[array.length-1];
        return max;
    }
    public static void main(String[] args) {
        int elements[] = {12,23,34,45,56,67,65,32,2};  
        int maximu = maximum(elements);
        System.out.println("The maximum element among the array is: " + maximu);  
    }    
}
