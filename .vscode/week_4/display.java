package week_4;
import java.util.*;
public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0;
        char check = 'Y';
        do{
            System.out.println("Enter a number ");
            int num = sc.nextInt();
            sc.nextLine();
            if(num > 0){
                positive ++;
            }
            else if(num < 0){
                negative++;
            }
            System.out.println("Do you want to enter a number? Enter Y for YES, N for NO ");
            String str = sc.nextLine();
            check = str.charAt(0);
        }while(check == 'Y');
        System.out.printf("Positive numbers: %d Negative numbers: %d",positive,negative );
        
    }
}
