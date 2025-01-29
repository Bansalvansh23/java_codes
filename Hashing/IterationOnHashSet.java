package Hashing;

import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        // Using Iterator
        // Iterator<String> it = set.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // Using Advanced For Loop
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
