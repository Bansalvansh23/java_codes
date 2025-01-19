// import java.util.Scanner;
// public class ReverseNum {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number you want to reverse: ");
//         int num = sc.nextInt();
//         while(num!=0){
//             int lastDigit = num %10;
//             System.out.print(lastDigit);
//             num = num /10;
//         }
//         sc.close();
//     }
// }

/// Another method for finding reverse of a number 

import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            rev = ((rev * 10) + lastDigit);
            num = num / 10;
        }
        System.out.println("Reverse of the number is: " + rev);
        sc.close();
    }
}