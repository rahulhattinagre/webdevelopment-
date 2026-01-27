import java.util.Scanner;

public class primeNum {

    // check prime number or not.
    public static void checkPrime(int n) {
        if(n<=1){
            System.out.println("Not Prime ");
            return;
        }
        int div=2;
        while(div<n){
            if(n%div==0){
                System.out.println("Not Prime ");
                return;
            }
                div++;
            }
            System.out.println("prime Number");
    }
   //even odd number check 

  /* public static void evenodd(int n) {
    if(n%2==0){
        System.out.println("Even Number");
    }else{
        System.out.println("Odd Number");
    }
    return;
   }*/

        //Table of given n number
      /*   public static void table(int n) {
            for(int i=1;i<=10;i++){
                System.out.println(n+"x"+i+"="+(n*i));
        
            }
            return;
        }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
    }
}
