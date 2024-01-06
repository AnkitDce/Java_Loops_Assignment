import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        // Finding minimum of two number
        int min , gcd = 0;
        if(a<b) min = a;
        else min = b;
        for(int i = min; i > 0 ; i--){
            if(a%i==0 && b%i==0){
                gcd = i;
                break;
            }
        }
        System.out.println("Gcd of "+a+" and " +b+" is "+gcd);
    }
}
