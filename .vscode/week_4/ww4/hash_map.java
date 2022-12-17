package week_4.ww4;
import java.util.*;
public class hash_map {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1,"Ram");
        hash_map.put(2,"Bharat");
        hash_map.put(3,"Lakshman");
        hash_map.put(4,"Shatrughna");

        System.out.println("Collection view of the hash map is :" + hash_map.values());
    }
}
