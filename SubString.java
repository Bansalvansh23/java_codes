public class SubString {
    public static void main(String[] args) {
        String str = "abcabcabc";

        // Inbuilt function for finding substring in java
        System.out.println(str.substring(0, 4));

        // Finding substring without using inbuilt function
        System.out.println(getSubstring(str, 0, 5));
    }

    public static String getSubstring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
