//span of array means the diffrence between maximum and minimum  element of array/////
import java.util.Scanner;                         //importing scanner class
public class SpanOfArray {
         //////////////span functiion//////////////
    public static void arrayspan(int arr[] ,int n){
       int  max=arr[0];
        int min=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        int span = max-min;
        System.out.println("the span of array is:-  "+span);
    }
                 ////////////main function/////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n :-");   // n= size of array;
    int n = sc.nextInt();
    int [] array = new int[n];

                         /////// loop for takeing inputs in array//////
        System.out.println("enter the values of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
                         ///////for printing array/////////////
        System.out.println("all enterd value by you are :- ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();                    ////////for next line////////
        arrayspan(array,n);                      //calling span function /////

    }
}
