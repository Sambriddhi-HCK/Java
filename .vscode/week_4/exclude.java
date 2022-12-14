package week_4;

import java.util.*;
public class exclude {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in); 
        boolean not_working = false; 
        int sum=0;
        int positive = 0;
        while(!not_working)
        {
        System.out.println(" Do you want to enter a number? Enter Y for YES, N for NO "); 
            String str = nu.nextLine(); 
            char check = str.charAt(0); 
            if(check == 'Y')
            {
                System.out.println("Enter the number: "); 
                int num = nu.nextInt(); nu.nextLine(); 
                if(num > 0 && num<100)
                {
                     sum += num; 
                } 
            }
            else{ not_working = true; 
        
        }
        }
        System.out.println("The series of (positive) integers entered by the user, excluding all numbers  that are Greater than 100 is: " + sum);
    }
}
