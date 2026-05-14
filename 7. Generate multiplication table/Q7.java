import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int a = sc.nextInt();
        int b;

        System.out.println("Table of "+a+" is given below :");
        for (int i = 1; i <= 10; i++) {
            b = a * i;
            System.out.println(a + " X " + i + " = " + b);
        }
    }
}