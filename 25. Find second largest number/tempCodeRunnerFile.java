import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, b, largest = 0;
        int[] a = new int[5];
        int i , j ;
        System.out.println("Enter the Number :");
        for ( i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    c = a[j];