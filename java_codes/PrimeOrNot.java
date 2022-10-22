import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");

        n = sc.nextInt();
        for ( int i = 2; i * i <= n; i++) {
            if (n % i == 0)
            {
                count ++;
                break;
            }
        }
                 if (count<1)
                    System.out.println(" prime");
                 else
                    System.out.println("not prime ");
    }
}

