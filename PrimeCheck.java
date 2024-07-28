import java.util.*;
 public class PrimeCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to check the prime numbers: ");
        int num = sc.nextInt();
        Primecheck(num);
        sc.close();
        PrimInRange(num);
    }

    //FUNCTION FOR PRIMTING PRIME NUMBERS IN A GIVEN RANGE

    public static void PrimInRange(int num){
        for(int i=2;i<=num;i++){
            if(Primecheck(i)){
                System.out.print(i+" ");
            }
        }
    }

    /// FUNCTION FOR CHECKING WHETHER THE NUMBER IS PRIME OR NOT

    public static boolean Primecheck(int num){
        if(num<=1){
            return false;
        }
        if (num == 2){
            return true;
        }
        else{
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}