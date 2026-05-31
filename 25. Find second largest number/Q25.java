import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, b, largest = 0;
        int[] a = new int[5];
        int i, j;
        System.out.print("Enter the Number : ");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }

        System.out.print("The sorted array is : ");
        for (i = 0; i < 5; i++) {
            System.out.print(" --> " + a[i]);
        }

        System.out.println("\nThe Second largest number is :" + a[1]);
        sc.close();
    }
}
