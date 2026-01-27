import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter Operator : ");
        char Operator= sc.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println("Addition of a & b : "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of a & b : "+(a-b));
                break;
            case '*':
                System.out.println("Multipication of a & b : "+(a*b));
                break;
            case '/':
                System.out.println("Division of a & b : "+(a/b));
                break;
            case '%':
                System.out.println("Modulo of a & b : "+(a%b));
                break;
            default :
                System.out.println("Wrong Operator");
                break;
        }

    }
    
}
