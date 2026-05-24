import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a, stg = 1;
        int sum = 0;
        int ori;

        System.out.println("Enter the Number :");
        num = sc.nextInt();
        ori = num;

        while (num != 0) {
            a = num % 10;
            for (int i = a; i > 1; i--) {
                stg = stg * i;
            }
            sum = sum + stg;
            num = num / 10;
            stg = 1;
        }

        if (sum == ori) {
            System.out.println("The given number '" + ori + "' is Strong Number ");
        } else {
            System.out.println("The given number '" + ori + "' is not Strong Number ");
        }
        sc.close();
    }
}