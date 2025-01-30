package Hashing;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        // Time complexity of this code is O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer k : map.keySet()) {
            if (map.get(k) > (arr.length / 3)) {
                System.out.println(k);
            }
        }
    }
}
