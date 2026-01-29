import java.util.Scanner;

public class primeNum {

    // check prime number or not.
    public static boolean checkPrime(int n) {
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
              return false;
            }
        }
        return true;

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
        System.out.println(checkPrime(n));
    }
}
