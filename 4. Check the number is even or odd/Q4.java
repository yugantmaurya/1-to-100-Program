import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();
        
        if(num%2==0)
        {
            System.out.print("The Given number '"+num+" is Even");
        }
        else{
             System.out.print("The Given number '"+num+"' is Odd");
        }
        sc.close();
    }
}
