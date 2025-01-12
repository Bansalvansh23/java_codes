public class StringCompress {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println("The new string is: " + Compress(str));
    }

    public static String Compress(String str) {
        // Time Complexity is O(n) because while loop me bhi i++ hoo raha hai

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && (str.charAt(i) == str.charAt(i + 1))) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
