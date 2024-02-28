package all_java;
import java.util.Scanner;
public class BitManipulation {
    public static void main(String args[]){
        System.out.print("\033c");

        // Get Bit 
        /*int n=5;// 0101
        int pos=2;
        int bitMask= 1<<pos; // left shift operator
        if((bitMask & n)==0){
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit was One");
        }*/

        // Set Bit 
        /*int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNum= bitMask | n;
        System.out.println(newNum);*/

        // Clear Bit 
        /*int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notBitMask= ~(bitMask);
        int newNum1= notBitMask & n;
        System.out.println(newNum1);*/

        // Update Bit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter what you want to change: ");
        int op = sc.nextInt();
        int n=5;
        int pos = 1;
        int bitMask = 1<<pos;

        if(op==1){
            //Set
            int newNum= bitMask | n;
            System.out.println(newNum);
        }
        else{
            int notBit = ~(bitMask);
            int newNum1= notBit & n;
            System.out.println(newNum1);
        }
        sc.close();
    }
}
