import java.util.*;
public class main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("enter a number : ");
            number=sc.nextInt();
            if(number%2==0){
               evenSum += number;

            }else{
                oddSum += number;
            }
            System.out.println("Do you want to continue ? then enter 1 for yes and enter 0 for NO");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even num :"+evenSum);
        System.out.println("Sum of even num : "+oddSum);
        
        }
}