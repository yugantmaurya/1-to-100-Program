import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0, i = 0;

        System.out.println("Enter the Number :");
        a = sc.nextInt();

        if (a == 0) {
            System.out.println("0");
            sc.close();
            return;
        }

        int[] c = new int[32];

        while (a != 0) {
            b = a % 2;
            a = a / 2;
            c[i] = b;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(c[j]);
        }
        sc.close();
    }
}
