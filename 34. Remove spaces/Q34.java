import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        String b = "";

        System.out.println("Enter the String");
        a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
                continue;
            } else {
                b = b + a.charAt(i);
            }
        }

        System.out.println("After remove string : \n" + b);
        sc.close();
    }
}