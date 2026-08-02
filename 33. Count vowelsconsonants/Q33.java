import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int vowel = 0, consonant = 0;
        int i;
        System.out.println("Enter the String :");
        a = sc.nextLine();

        for (i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);

            if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                vowel++;
            } else {
                consonant++;
            }
        }

        System.err.println("There is a " + vowel + " Vowel in String");
        System.err.println("There is a " + consonant + " Consonent in String");

        sc.close();
    }
}
