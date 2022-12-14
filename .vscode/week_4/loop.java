package week_4;
public class loop {
    public static void main(String[] args) {
       int number=200;
       int sum=0;
       System.out.println("The sum of even numbers from 100 to 200, inclusive is: ");
       for (int i= 100; i <=number; i++) {
        if (i%2==0){
            sum += i;
        }
       }
       System.out.println(" " + sum);
    
    }
}
