import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, Smallest;

        System.out.print("Enter the Value of Numbers :");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the Number :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Smallest = a[0];

        for (int i = 0; i < n; i++) {
            if (Smallest > a[i]) {
                Smallest = a[i];
            }
        }

        System.out.println("The smallest number in array is :" + Smallest);
    }
}
