import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = 0, f2 = 1;
        int sum;
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(f1);
        } else if(n == 2){
            System.out.print(f1+ " " +f2);
        } else{
            System.out.print(f1+ " " +f2+" ");
            for (int i = 1; i <= n-2; i++) {
                sum = f1 + f2;
                f1 = f2;
                f2 = sum;
                System.out.print(sum+" ");
            }
        }
        
        sc.close();
    }
}
