import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b = "";
        int i, j, duplicate = 0;

        System.out.println("Enter the String :");
        a = sc.nextLine();

        for (i = 0; i < a.length(); i++) {
            for (j = i + 1; j < a.length(); j++) {
                if (a.charAt(j) == a.charAt(i)) {
                    if (b.indexOf(a.charAt(i)) == -1) {
                        b = b + a.charAt(i);
                        duplicate++;
                    }
                    break;
                }
            }
        }

        if (duplicate > 0) {
            System.out.println("The duplicate item is found : " + b );
        } else {
            System.out.println("The duplicate item is not found ");
        }
        sc.close();
    }
}
