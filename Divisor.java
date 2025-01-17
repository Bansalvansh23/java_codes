import java.util.ArrayList;
//import java.util.Arrays;

public class Divisor {
    public static void main(String[] args) {
        int n =3;
        int res=0;
        for(int i=1;i<=n;i++){
            res += ((n/i)*i);
        }
        System.out.println(res);
    }
}
