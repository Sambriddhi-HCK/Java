package week_4;
import java.util.Scanner; 
public class factoria 
{ 
    public static void main(String[] args) 
    { 
        int facto=1; 
        int i=1; 
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: "); 
        int num= input.nextInt(); 
        while(i<=num) 
        { 
            facto=facto*i; i++; 
        } 
        System.out.println("The factorial of "+num+" is "+facto); 
    
    }
}