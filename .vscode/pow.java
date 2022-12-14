import java.util.Scanner;

public class pow {
    public static void main(String[] args) 
    {
        int power=1;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("Enter another number");
        int b= sc.nextInt();
        for (i=1; i<=b; i++){
            power=power*a;
        }
        System.out.println("The value of a raised to the power of b is "+ power);
    }
}
