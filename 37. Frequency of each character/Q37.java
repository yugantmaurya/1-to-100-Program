import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int i, j, count = 1;

        System.out.println("Enter the String ");
        a = sc.nextLine();

        boolean[] visited = new boolean[a.length()];
        for (i = 0; i < a.length(); i++) {
            if (visited[i]) {
                continue;
            }
            for (j = i + 1; j < a.length(); j++) {

                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a.charAt(i) + " = " + count);
        }
        sc.close();
    }
}
