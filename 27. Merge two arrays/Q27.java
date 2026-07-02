import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, j = 0;

        System.out.println("Enter the Size of array ;");
        n = sc.nextInt();

        m = 2 * n;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[m];
        int i;

        System.out.println(" Enter the Frist Array :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(" Enter the Second Array :");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (i = 0; i < m; i++) {
            if (i < n) {
                c[i] = a[i];
            } else {
                c[i] = b[j];
                j++;
            }
        }

        System.out.println("Ther merge of array is :");
        for (i = 0; i < m; i++) {
            System.out.print(" " + c[i]);
        }
        sc.close();
    }
}