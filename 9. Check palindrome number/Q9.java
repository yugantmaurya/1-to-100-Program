import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, reverse = 0, rem, original;

        System.out.print("Enter the Number :");
        num = sc.nextInt();

        original = num;

        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("The Given Number is Palindrome");
        } else {
            System.out.println("The Given number is not Palindrome");
        }
        sc.close();
    }
}
