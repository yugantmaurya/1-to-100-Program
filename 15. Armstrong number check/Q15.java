import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a, arm = 1, copyno;
        int digit = 0;
        int sum = 0;
        int j = 0, pri;

        System.out.println("Enter the Number :");
        num = sc.nextInt();
        copyno = num;
        pri = num;
        while (copyno != 0) {
            copyno = copyno / 10;
            digit++;
        }

        while (num != 0) {
            a = num % 10;
            for (int i = 0; i < digit; i++) {
                arm = arm * a;
            }
            sum = sum + arm;
            num = num / 10;
            arm = 1;
        }

        if (sum == pri) {
            System.out.println("The given number '" + pri + "' is Armstrong Number ");
        } else {
            System.out.println("The given number '" + pri + "' is not Armstrong Number ");
        }
        sc.close();
    }
}