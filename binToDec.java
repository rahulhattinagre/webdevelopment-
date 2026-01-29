import java.util.Scanner;

public class binToDec {
    public static void binNum(int binNUm){
        int myNum=binNUm;
        int decNum=0;
        int pow =0;
        while (binNUm>0) {
            int lastDigit= binNUm %10;
           decNum = decNum +(lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNUm=binNUm/10;
        }
        System.out.println("Decimal num of"+myNum+" = "+decNum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        int binNUm=sc.nextInt();
        binNum(binNUm);
        
    }
    
}
