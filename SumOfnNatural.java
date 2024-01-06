import java.util.Scanner;

public class SumOfnNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println("Sum of the number upto "+n+" is "+sum);
    }
}
