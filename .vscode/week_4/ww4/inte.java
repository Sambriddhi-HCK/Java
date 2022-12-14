package week_4.ww4;

import java.util.*;
public class inte {
    
    public static void main(String[] args) {
        List fruit = new ArrayList (Arrays.asList( " 'apple' ", " 'banana' " , " 'pear' " , " 'cherry' "));
        fruit.set(0, "'Grape'");
        fruit.set(2, "'Date'");
        fruit.add(4, "'Orange'");
        System.out.println("List is " + fruit);
    }
}
