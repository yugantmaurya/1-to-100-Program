import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a ;
        int i ;

        System.out.println("Enter the string :");
        a = sc.nextLine();

        String[] word = a.split(" ");

        String log = "" ;

        for(i = 0 ; i < word.length ; i++){
              if (word[i].length() > log.length()) {
                log = word[i];
            }
        }

        System.out.println("Longest : "+log);
        sc.close();
    }
}
