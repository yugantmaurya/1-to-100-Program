import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, o, i, c = 0, b = 0;

        System.out.println("Enter the value of number:");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the Numbers :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 1; i <= n + 1; i++) {
            b += i;
        }

        for (i = 0; i < n; i++) {
            c += a[i];
        }

        o = b - c;

        if (o == 0) {
            System.out.println("There is no missing number.");
        } else {
            System.out.println("The missing number is: " + o);
        }
        sc.close();
    }
}
