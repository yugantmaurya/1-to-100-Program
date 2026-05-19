import java.util.Scanner;

public class Q13 {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int a , count = 0 ;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        for(int i = 1 ; i <= a ; i++ ){
            if ( a%i==0){
                count++;
            }
            
            if(count == 3 ){
                break;
            }
        }
        if(count == 2){
            System.out.println("The given number "+ a +" is Prime Number");
        }
        else{
            System.out.println("The given number "+ a +" is not Prime Number");
        }
        sc.close();
    }
}