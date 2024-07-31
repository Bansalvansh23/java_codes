import java.util.*;

public class PlaidromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPlaidrome(num);
        sc.close();
    }

    public static void isPlaidrome(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = lastDigit + (rev * 10);
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Plaidrome");
        } else {
            System.out.println("Not Plaidrome");
        }
    }
}
