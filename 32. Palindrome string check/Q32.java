import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a ;
        int i , c , d = 0;

        System.out.println("Enter the Strings");
        a = sc.nextLine();

        c= a.length();
        char[] b = new char[c];

        for (i = a.length() - 1; i >= 0; i--) {
            b[d] = a.charAt(i);
           d++; 
        }

        String revers = new String(b) ;

        if(a.equals(revers)){
            System.out.println("The given String '"+a+"' is Pralindrom");
        }
        else{
            System.out.println("The given String '"+a+"' is not Pralindrom");
        }
        
        sc.close();



    }
}
