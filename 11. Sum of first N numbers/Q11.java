import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("How many numbers do you want to enter: ");
        n = sc.nextInt();
        int[] a = new int[n];
        int b = 0 , i;
        System.out.println("Enter the Numbers :");
        for( i = 0 ; i < a.length ; i++ ){
            a[i] = sc.nextInt();
        }

        for( i = 0 ; i < a.length ; i++){
            b = b + a[i];
        }

        System.out.println("The sum of given numbers "+b);
        sc.close();
    }
}