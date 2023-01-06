import java.util.*;

public class codingchallenge1 {

    ArrayList getInput(ArrayList<Integer> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your list size");
        int ls = sc.nextInt();
        for (int i = 0; i < ls; i++) {
            System.out.println("Enter your element: ");
            al.add(sc.nextInt());
        }
        return al;
    }

    void getOutput(ArrayList<Integer> al) {
        System.out.println("Unsorted Array List: ");
        System.out.println(al);
    }
}
