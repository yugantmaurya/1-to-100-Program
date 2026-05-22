import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a, arm = 1, copyno;
        int digit = 0;
        int sum  = 0;
        int j = 0 , pri;

        System.out.println("Enter the Number :");
        num = sc.nextInt();
        copyno = num;
        pri = num;
        while (copyno != 0) {
            copyno = copyno / 10;
            digit++;
        }
        int[] no = new int[digit];

        while (num != 0) {
            a = num % 10;
            for (int i = 0; i < digit; i++) {
                arm = arm * a;
            }
            no[j] = arm ;
            j++;
            num = num / 10;
            arm = 1 ;
        }
        for(int i = 0 ; i < digit ; i++){
            sum = sum + no[i];