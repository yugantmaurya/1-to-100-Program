import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, k, c = 0;
        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Enter the Array:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the Step value Where to Start Rotate:");
        k = sc.nextInt();

        k = k % 5;

        for (i = 0; i < 5; i++) {
            if (i < k) {
                b[5 - k + i] = a[i];
            } else {
                b[c] = a[i];
                c++;
            }
        }

        System.out.println("Rotated Array:");
        for (i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}