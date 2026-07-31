import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        int i;

        System.out.print("Enter String: ");
        a = sc.nextLine();

        System.out.println("The reverse String is :");
        for (i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }

        sc.close();
    }
}