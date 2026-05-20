import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, count;

        System.out.println("There is a prime number between 1 to 100 :");

        for (i = 1; i <= 100; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count == 3) {
                    break;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
