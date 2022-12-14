package week_4;

public class errorfix {
    public static void main(String[] args) {
        int num;
        int product = 1;
        String a = System.console().readLine("Enter a number to continue or 0 to stop");
        num = Integer.parseInt(a);
        while (num != 0) {
            a = System.console().readLine("Enter a number to continue or 0 to stop");
            num = Integer.parseInt(a);
            product = product * num;
        }
    
        System.out.printf("product = %d", product);
    }
}
