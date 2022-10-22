import java.util.Scanner;
class Main{
    public static void main(String[] args) {
      int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if(a>b && a>c)
        System.out.println("greater number is"+a);
        else if(b>a && b>c)
        {
        System.out.println("greater number is"+b);
    }
else
    System.out.println("greater number is"+c);

    }
}
