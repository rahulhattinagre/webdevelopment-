import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length;i>=0;i++){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits=new int[n];

        for(int i=0;i<=n;i++){
            digits =sc.nextInt();
            
        }

    }
}