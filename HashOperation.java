import java.util.*;

public class HashOperation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insert operation in hash
        map.put("India", 100);
        map.put("USA", 50);
        map.put("UK", 200);

        System.out.println(map);

        // get operation in hash
        System.out.println(map.get("India")); // 100
        System.out.println(map.get("Pakistan")); // nulll

        // contians operation to check the presence of key
        System.out.println(map.containsKey("USA")); // true
        System.out.println(map.containsKey("Pakistan")); // false

        // remove operation in hash
        System.out.println(map.remove("UK"));
        System.out.println(map);
        System.out.println(map.remove("Pakistan")); // null

        //Iteration on HashMap
        Set<String> keys = map.keySet();
        for(String k : keys){
            System.out.println(k + " " + map.get(k));
        }
    }
}
