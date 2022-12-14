import java.util.Scanner; 
public class counting { 
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in); 
         boolean not_working = false; 
         int zero = 0,positive = 0, negative = 0; 
         while(!not_working)
         { 
            System.out.println("Do you want to enter a number? YES = Y, NO = N: "); 
            String str = sc.nextLine(); 
            char check = str.charAt(0); 
            if(check == 'Y')
            {
                 System.out.println("Enter the number: "); 
                 int num = sc.nextInt(); 
                 sc.nextLine(); 
                 if(num == 0){ zero++; 
                } 
                else if(num > 0)
                {
                    positive ++; 
                    } else
                    { 
                        negative++; 
                    } 
                } else{ 
                    not_working = true; 
                } 
            } System.out.printf("Positive numbers: %d Negative numbers: %d Zero: %d",positive,negative,zero);
            
        }
    }
