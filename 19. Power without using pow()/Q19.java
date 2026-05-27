import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, re = 1;

        System.out.print("Enter the Number :");
        a = sc.nextInt();

        System.out.print("Enter the Power value :");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            re = re * a;
        }

        System.out.println("The Power of Given Number is :" + re);
        sc.close();
    }
}
