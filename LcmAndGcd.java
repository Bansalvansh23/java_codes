import java.util.*;
public class LcmAndGcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is: "+findGcd(a,b));
        System.out.println("The LCM of "+a+" and "+b+" is: "+findLcm(a,b));
        sc.close();
    }
    public static int findGcd(int a, int b){
        int temp;
        while(b!=0){
            temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findLcm(int a, int b){
        int lcm = ((a*b)/findGcd(a,b));
        return lcm;
    }
}
