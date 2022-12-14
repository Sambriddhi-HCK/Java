package week_4;

public class inbrco {
    public static void main(String[] args) {
        int i = 100;
        int number = 200;
        int sum = 0;

        while (true) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
            
            if (i <= number) {
                continue;
            }else{
                break;
            }
        }

        System.out.println("The sum of even numbers from 100 to 200, inclusive is: "+ sum);

    }
}
