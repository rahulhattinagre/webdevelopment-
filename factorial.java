import java.util.Scanner;

public class factorial {
    public static void calculateFactoral(int n) {
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial =1 ;
        for(int i=1;i<=n;i++){
            factorial*=i;

        }
        System.out.println("Factorial "+factorial);
        return;
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive integer :");
        int n=sc.nextInt();
        calculateFactoral(n);
        }
    }
