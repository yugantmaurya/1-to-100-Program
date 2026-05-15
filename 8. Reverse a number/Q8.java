import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] no = new int[5];

        System.out.println("Enter The 5 Numbers:");

        for (int i = 0; i < no.length; i++) {
            no[i] = sc.nextInt();
        }

        System.out.println("The Reverse Number is :");

        for (int i = no.length - 1; i >= 0; i--) {
            System.out.print(no[i] + "\t");
        }

        sc.close();
    }
}