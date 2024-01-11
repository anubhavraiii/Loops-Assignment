import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem,rev=0;
        int originalnum = num;
        
        while(num != 0)
        {
           rem = num % 10;
           rev = rev * 10 + rem;
           num = num / 10;
        }
        if (originalnum == rev) {
            System.out.println("Pallindrome number");
        } else
            System.out.println("Not a pallindrome");
        
        sc.close();
    }
}