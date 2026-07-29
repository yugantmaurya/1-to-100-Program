import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentsum, maxsum = 0;
        int[] a = new int[5];
        int i;

        System.out.println("Enter the number of array :");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        maxsum = a[0];
        currentsum = 0;

        for (i = 0; i < 5; i++) {
            currentsum += a[i];
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
            if (currentsum < 0) {
                currentsum = 0;
            }
        }

        System.out.println("Kadane’s Algorithm (maximum subarray sum) is :" + maxsum);
        sc.close();
    }
}
