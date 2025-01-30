package Hashing;

import java.util.*;

public class CountDistinct {
    // Time Complexity using this approach is O(n)
    public static int countNum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        System.out.println(countNum(arr)); 
    }
}
