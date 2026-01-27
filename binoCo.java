import java.util.Scanner;

public class binoCo {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bionomial(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);

        int cal=nfact/(rfact*nrfact);

        return cal;
    }
    public static void main(String[] args) {
        System.out.println(bionomial(5, 2));     
    }
    
}
