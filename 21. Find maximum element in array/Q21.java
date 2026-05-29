import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, largest = 0;

        System.out.print("Enter the Value of Numbers :");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the Number :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
        }

        System.out.println("The number in array is :" + largest);
    }
}
