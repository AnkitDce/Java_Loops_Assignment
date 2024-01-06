import java.util.Scanner;

public class TableOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Table of "+n+" is :");
        while (i<=10){
            System.out.println(n*i);
            i++;
        }
    }
}
