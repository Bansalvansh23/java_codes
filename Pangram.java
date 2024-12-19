import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String str) {
        boolean[] alphabetPresent = new boolean[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < alphabetPresent.length; i++) {
            if (!alphabetPresent[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a pangram:");
        String str = scanner.nextLine();
        if (isPangram(str)) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is NOT a pangram.");
        }

        scanner.close();
    }
}
