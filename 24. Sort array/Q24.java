import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, c;

        System.out.print("Enter the value of numbers :");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the number  :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }

        System.out.println("The Sort array is :");
        for (i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        sc.close();
    }
}
