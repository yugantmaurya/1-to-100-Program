import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c, n;
        System.out.print("How many numbers do you want print in Fibonacci series :");
        n = sc.nextInt();

        System.out.println("Fibonacci series :");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+a);
            c = a + b;
            b = a;
            a = c;
        }
        sc.close();
    }
}