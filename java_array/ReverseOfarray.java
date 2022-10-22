import java.util.Scanner;                         /////importing scanner class
public class ReverseOfarray {
               //////reverse array function/////
   public static void reverse(int arr[], int n){
        int i = 0;
        int l = n-1;
        while(i<l){
            int temp=arr[l];
            arr[l]=arr[i];
            arr[i]=temp;
            i++;
            l--;
        }
   }
                       //////printarray function/////
   public static void printarray(int arr[], int n) {
       for (int i = 0; i <n; i++) {
           System.out.print(" " + arr[i] + " ");
       }
   }
                   //////////main function //////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :- ");
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.print("enter the element of array :-");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        reverse(arr,n);                                    ///calling function reversearry
        System.out.print("reverse arr is :-  ");
       printarray(arr,n);                                   //calling function printarray

    }
}