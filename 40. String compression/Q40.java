import java.util.Scanner;

public class Q40 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String a, b = "";
      int count = 1;
      String ch = " ";

      System.out.println("Enter the String:");
      a = sc.nextLine();

      for (int i = 0; i < a.length(); i++) {

         if (i < a.length() - 1 && a.charAt(i) == a.charAt(i + 1)) {
            count++;
         } else {
            b = b + a.charAt(i) + count + ch ;
            count = 1;
         }
      }

      System.out.println("Compression: " + b);

      sc.close();
   }
}