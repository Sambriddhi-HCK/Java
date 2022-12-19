package week_4;
import java.util.Scanner; 
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Enter a number, n. The fibonacci series of n terms will be printed. ");
        int n= fs.nextInt(); 
        int a = 0;
        int b = 1;
        for (int i = 1; i<=n; ++i) {
        System.out.print( a + "," );
        int fibo = a + b;
        a = b;
        b = fibo;
        }
    }
}
