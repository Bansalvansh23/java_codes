import java.util.Scanner;
public class Searching {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the number you want to find: ");
        int key = sc.nextInt();
        //LinearSearch(arr, key);
        System.out.println("The index of key element is: "+ BinearySearch(arr, key));
        sc.close();
    }
    
    public static void LinearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element is present at index " + i);
            }
        }
    }

    public static int BinearySearch(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
