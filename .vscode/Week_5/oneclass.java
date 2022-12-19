package Week_5;

import java.util.*;
public class oneclass {
    public int addNumbers(int a, int b) {
    int sum = a + b;
    return sum; 
    }
    public int multiplyNumbers(int a, int b) {
        int pr = a * b;
        return pr;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        oneclass objOneclass = new oneclass();
        int aresult = objOneclass.addNumbers(num1,num2);
        System.out.println("The addition of a and b results " + aresult);

        int bresult = objOneclass.multiplyNumbers(num1, num2);
        System.out.println("The multiplication of a and b results " + bresult);
    }

}

