import java.util.Scanner;                 //importing scanner class
public class AlternetSwap {
                       ///////// swap function/////
    public static void swaparray(int arr[], int n) {
        for (int i = 0; i < n; i = i + 2) {
            if (i + 1 < n) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

    }
                      ///////// print arry function  ///////////
    public static void printarry(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
                     //////////main function //////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of arry : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swaparray(arr, n);                       //swap function call
        printarry(arr, n);                       // print funtion call

    }
}