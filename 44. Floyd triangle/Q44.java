import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , i , j ;
        int d= 1;

        System.out.println("Enter the Number of Row :");
        a = sc.nextInt();

        for(i=0; i<a+1 ; i++){
            for(j=0 ; j<i ;j++){
                System.out.print(" "+ d);
                d++;
            }
            System.out.println();
        }
        sc.close();
    }
}
