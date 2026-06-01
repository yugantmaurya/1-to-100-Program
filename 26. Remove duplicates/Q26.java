import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        int[] a = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int choice = 2;

        while(choice == 2) {

            System.out.print("Delete: ");
            int b = sc.nextInt();

            int pos = -1;

            for(int i = 0; i < n; i++) {
                if(a[i] == b) {
                    pos = i;
                    break;
                }
            }

            if(pos == -1) {
                System.out.println("Number not found!");
            } else {

                for(int i = pos; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }

                n--;

                System.out.println("After Remove:");

                for(int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.println();
            }

            System.out.println("\nExit = 1");
            System.out.println("Remove Another = 2");

            choice = sc.nextInt();
        }

        sc.close();
    }
}