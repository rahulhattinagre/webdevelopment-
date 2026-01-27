public class swap{
    public static void swapValue(int num1,int num2) {
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swapValue(a, b);
    }
}