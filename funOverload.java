import java.util.Scanner;
public class funOverload {
    public static int sums(int a,int b){
        return a+b;
    }
    public static int sums(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int cal=sums (a,b);
        System.out.println("Sum of a & b  : "+cal);
        int cal1=sums(a,b,c);
        System.out.println("Sum of a,b & c nums : "+cal1);

    }
    
}
