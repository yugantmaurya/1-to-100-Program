import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n ;

        System.out.print("Enter the Value of Numbers :");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the Number :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The reverse Array is :");

        for(int i = n-1 ; i>=0;i--){
            System.out.print(" "+a[i]);
        }
    }
}
