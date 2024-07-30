import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to convert from dec to bin: ");
        int num = sc.nextInt();
        DecToBin(num);
        sc.close();
    }
    public static void DecToBin(int num){
        int myNum = num;
        int pow =0;
        int bin =0;
        while(num>0){
            int rem = num%2;
            bin = bin + rem *(int) Math.pow(10,pow);
            pow++;
            num = num/2;
        }
        System.out.println("The binary of "+myNum+" is "+bin);
    }
}

