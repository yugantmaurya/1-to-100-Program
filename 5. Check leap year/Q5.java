import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year :");
        int a = sc.nextInt();

        if(a%4==0){
            System.out.println("The Given Year is a laep year");
        }
        else{
            System.out.println("The Given Year is not a leap year");
        }
        sc.close();
    }
}
