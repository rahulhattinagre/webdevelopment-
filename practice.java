import java.util.Arrays;
import java.util.Scanner;
public class practice {
    public static int findLarSmall(int n[],int key){
    int start=0;
    int end=n.length-1;
    while (start<=end) {
        int mid=(start+end)/2;
        if(n[mid]==key){//mid
            return mid;
        }
        else if(n[mid]<key){//left
            start=mid+1;

        }else{//right
            end=mid-1;
        }  
 
    }
    return -1;
    }

    public static void main(String [] args) {
        int n[]={1,2,2,7,8,0,13,10,9};
        int key=9;
        Arrays.sort(n);
        System.out.println(findLarSmall(n,key) );
    }
}
