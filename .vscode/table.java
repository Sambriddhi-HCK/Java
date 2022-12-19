import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        int n = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = input.nextInt();
        if (num>0){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + i * num);
        }
        }
        else{
            System.out.println("A positive number was asked.");
        }
        
    }
}