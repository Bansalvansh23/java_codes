public class BitManipulation {
    public static void OddOrEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public static void main(String[] args) {
        OddOrEven(2);
        OddOrEven(71);
    }
}
