import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd = 0;
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0)
               gcd = i;
        }
        System.out.println("GCD = "+gcd);
        sc.close();
    }
}
