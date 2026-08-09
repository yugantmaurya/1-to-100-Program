import java.util.Scanner;

public class Q38 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a, b = "";

      System.out.println("Enter The Strings :");
      a = sc.nextLine();

      for (int i = 0; i < a.length(); i++) {

         char ch = a.charAt(i);

         if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
         }

         b = b + ch;
      }

      System.out.println("Uppercase: " + b);
      sc.close();
   }
}