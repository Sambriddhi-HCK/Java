package week_4.ww4;
import java.util.*;
public class sortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your array length");
        int l=sc.nextInt();
        int num[] = new int [100];
        for (int i=0;i<l;i++){
        System.out.println("Enter your array element:");
        num[i]=sc.nextInt();
        }
        boolean sorted = true;
        if (num[0]< num[1]){
            for (int i=0; i<l-1; i++){
                if (num[i]> num[i+1]){
                    sorted= false;
                }
            }
        }
        else{
            for(int i=0;i<l-1; i++){
                if (num[i]< num[i+1]){
                    sorted = false;
                }
            }
        }
        if (sorted == true){
        System.out.println("The array is sorted. ");
        }else{
            System.out.println("The array is not sorted. ");
        }
    }
}
