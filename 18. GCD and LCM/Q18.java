import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, mo, a;
        int b = 0, l = 0, k = 0;

        System.out.print("Enter the First Number :");
        no = sc.nextInt();

        System.out.print("Enter the Second Number :");
        mo = sc.nextInt();

        int[] n = new int[no];
        int[] m = new int[no];
        int[] o = new int[no];

        a = no;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                n[l] = i;
                l++;
            }
        }

        a = mo;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                m[k] = i;
                k++;
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < k; j++) {
                if (n[i] == m[j]) {
                    o[b] = n[i];
                    b++;
                }
            }
        }

        int lar = 0;
        for (int i = 0; i < b; i++) {
            if (lar < o[i]) {
                lar = o[i];
            }
        }

        System.out.println("the GCD is :" + lar);
        sc.close();
    }
}
