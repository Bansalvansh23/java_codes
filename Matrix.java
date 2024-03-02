package all_java;
import java.util.*;

// Searching in 2-d array
public class Matrix {
    public static void main(String args[]){
        System.out.print("\033c");
        int i,j;
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(arr[i][j]==num){
                    System.out.println("Location found at: "+i+","+j);
                }
            }
        }
    }
}
