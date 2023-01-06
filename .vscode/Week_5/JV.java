package Week_5;

import java.util.*;

class Student {
    int id;
    String name;
}

public class JV {
    public static void main(String[] args) {
        Student one = new Student();
        Student two = new Student();

        one.id = 101;
        two.id = 102;
        one.name = "Bidhi";
        two.name = "Eliza";
        System.out.println("Student id-" +one.id + " : " + one.name);
        System.out.println("Student id-" +two.id + " : " + two.name);
    }

}
