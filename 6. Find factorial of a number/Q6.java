import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int a = sc.nextInt();
        int b = 1;

        for (int i = a; i > 0; i--) {
            b = b * i;
        }
        System.out.println("The Factorial of given number '"+a+"' is " + b);
        sc.close();
    }
}
