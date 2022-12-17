package week_4.ww4;
import java.util.*;

public class retain {
    public static void main(String[] args) {
        HashSet A = new HashSet();
        A.add("Puppy");
        A.add(8);
        A.add("hi");
        A.add("hello");
        A.add("kitty");
    
        HashSet B = new HashSet();
        B.add("6");
        B.add("mother");
        B.add("kitty");
        B.add("45");
        B.add("Puppy");

        HashSet C = new HashSet();
        C.addAll(A);
        C.retainAll(B);
        System.out.println(C);
    }
}
