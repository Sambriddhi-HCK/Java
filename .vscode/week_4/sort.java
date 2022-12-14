package week_4;
import java.util.*;
public class sort {
    public static void main(String[] args) {
        List <String> sList=new ArrayList<String>();
        sList.add("e");
        sList.add("a");
        sList.add("u");
        sList.add("i");
        sList.add("o");
        Collections.sort(sList, Collections.reverseOrder());
        for (String str: sList){
        System.out.println(" " + str);
        }
    }
}
