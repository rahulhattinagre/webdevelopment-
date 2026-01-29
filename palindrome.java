import java.util.Scanner;

public class palindrome {
    public static boolean palindromenum (int n){
        int palindrome=n;
        if(isPalindrome(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(n);
    }
    
}
