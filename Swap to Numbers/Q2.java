import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Value of A = ");
    int a = sc.nextInt();

    System.out.println("Enter the value of B = ");
    int b = sc.nextInt();
    System.out.println("Before Swap Value");
    System.out.println("A = " + a + "\n B = " + b);
    System.out.println("And After the Swap value is");

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("A = " + a + "\n B = " + b);
}