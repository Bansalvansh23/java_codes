package Hashing;

import java.util.*;

public class UnionAndInter {
    // The time complexity for this code is O(n+m)
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        return set.size();
    }

    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        int count = 0;
        for (int i : arr2) {
            if (set.contains(i)) {
                count++;
                set.remove(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        System.out.println("The union is: " + union(arr1, arr2));
        System.out.println("The intersection is: " + intersection(arr1, arr2));
    }
}
