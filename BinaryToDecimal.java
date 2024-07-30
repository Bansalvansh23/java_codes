import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n = sc.nextInt();
        Binarytodecimal(n);
        sc.close();
    }
    public static void Binarytodecimal(int n){
        int num =n;
        int pow = 0;
        double dec = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + (lastDigit * Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("The decimal number of "+num+" is: "+dec);
    }
}
