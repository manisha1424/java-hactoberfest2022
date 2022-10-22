import java.util.Scanner;
public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:- ");
        int n = sc.nextInt();
if(n<=26) {
    for (int i = 1; i <= n; i++) {
        char x = 'A';
        x = (char) (x + (n - i));
        for (int j = 1; j <= i; j++) {
            System.out.print(x);
            x++;
        }
        System.out.println();
    }
}
else
    System.out.println("Number out of bount, please enter number bellow 27");
    }
}

