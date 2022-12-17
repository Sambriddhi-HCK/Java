package week_4.ww4;
import java.util.*;
public class key {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"Ram");
        hashtable.put(2,"Bharat");
        hashtable.put(3,"Lakshman");
        int n = hashtable.size();
        System.out.println("The number of key-value mappings is :" + n);
    }
}
