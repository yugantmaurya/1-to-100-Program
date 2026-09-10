import java.util.Scanner;

public class Q45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, i, j, b;

        System.out.println("Enter the Number Of row :");

        b = sc.nextInt();

        a = b - 1;

        for (i = 0; i <= a; i++) {

            for (j = 0; j <= a; j++) {

                if (i == 0 || i == a || j == 0 || j == a) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }
            }

            System.out.println();
        }

        sc.close();
    }
}