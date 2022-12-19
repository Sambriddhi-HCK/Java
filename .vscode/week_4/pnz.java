package week_4;
import java.util.Scanner;
public class pnz {
    public static void main(String[] args) {
        Scanner pn = new Scanner(System.in); 
        boolean not_working = false; 
        int zero = 0,positive = 0, 
        negative = 0; 
        while(!not_working)
        { 
            System.out.println(" Do you want to enter a number? Enter Y for YES, N for NO "); 
            String str = pn.nextLine(); 
            char check = str.charAt(0); 
            if(check == 'Y')
            {
                System.out.println("Enter the number: "); 
                int num = pn.nextInt(); pn.nextLine(); 
                if(num == 0)
                {
                     zero++; 
                } 
                else if(num > 0)
                {
                     positive++; 
                } 
                else 
                { 
                    negative++; 
                }
            } 
             else{ not_working = true; 
            }            
        }
        System.out.printf("Positive numbers: %d Negative numbers: %d Zero: %d",positive,negative,zero);
    }
}