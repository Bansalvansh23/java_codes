// In linkedHashMap the hashmap is in a order in which it was entered
package Hashing;
import java.util.*;
public class LinkedHash {
    public static void main(String[] args){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("India",100);
        map.put("USA",200);
        map.put("UK",300);
        System.out.println(map);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("USA",200);
        hm.put("UK",300);
        System.out.println(hm);
    }
}
