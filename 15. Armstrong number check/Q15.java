import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a, arm = 1, copyno;
        int digit = 0;
        int sum  = 0;
        int[] no = new int[digit];

        System.out.println("Enter the Number :");
        num = sc.nextInt();
        copyno = num;
        while (copyno != 0) {
            copyno = copyno / 10;
            digit++;
        }

        while (num != 0) {
            a = num % 10;
            for (int i = 1; i <= digit; i++) {
                arm = arm * a;
                no[i] = arm;
            }
            num = num / 10;
        }
        for(int i = 1 ; i <= digit ; i++){
            sum = sum + no[i];
        }
        System.out.println(sum);
    }
}