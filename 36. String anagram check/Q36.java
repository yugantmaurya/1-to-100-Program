import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a, b;
        int i, j, count = 0;

        System.out.println("Enter First String:");
        a = sc.nextLine();

        System.out.println("Enter Second String:");
        b = sc.nextLine();

        if (a.length() != b.length()) {
            System.out.println("The given strings are not Anagram Strings");
            return;
        }

        boolean[] visited = new boolean[b.length()];

        for (i = 0; i < a.length(); i++) {
            for (j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j) && !visited[j]) {
                    visited[j] = true;
                    count++;
                    break;
                }
            }
        }

        if (count == a.length()) {
            System.out.println("The given strings are Anagram Strings");
        } else {
            System.out.println("The given strings are not Anagram Strings");
        }

        sc.close();
    }
}