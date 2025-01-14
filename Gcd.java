public class Gcd {
    public static void main(String[] args) {
        int a=6,b=9;
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b){
        int temp=0;
        while(b!=0){
            temp =b;
            b=a%b;
            a = temp;
        }
        return a;
    }
}
