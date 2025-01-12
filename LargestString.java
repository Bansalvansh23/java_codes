public class LargestString {
    public static void main(String[] args) {

        // Time Complexity of this is O(x*n) where x is the length of string

        String[] str = { "vansh", "Bansal", "Kapil", "garg" };
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println("The largest string is: " + largest);
    }
}
