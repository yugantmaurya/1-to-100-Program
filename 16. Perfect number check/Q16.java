import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, sum = 0;

        System.out.println("Enter the number :");
        n = sc.nextInt();

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("The given number '" + n + "' is Perfect Number ");
        } else {
            System.out.println("The given number '" + n + "' is not Perfect Number ");
        }
        sc.close();
    }
}
