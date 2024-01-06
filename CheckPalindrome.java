import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        boolean check = true;
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) check = false;
            break;
        }
        if(check){
            System.out.println(str+" is a palindrome");
        }
        else System.out.println(str+" is not a palindrome");
    }
}
