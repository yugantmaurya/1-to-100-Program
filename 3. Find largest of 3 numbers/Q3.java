import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] no = new int[3];

        System.out.println("Enter The 3 Numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            no[i] = sc.nextInt();
        }

        // Largest of three ka sahi logic
        if (no[0] >= no[1] && no[0] >= no[2]) {
            System.out.println("Largest value: " + no[0] + " (Position 1)");
        } 
        else if (no[1] >= no[0] && no[1] >= no[2]) {
            System.out.println("Largest value: " + no[1] + " (Position 2)");
        } 
        else {
            System.out.println("Largest value: " + no[2] + " (Position 3)");
        }

        sc.close(); // Scanner hamesha main method ke andar close karein
    }
}