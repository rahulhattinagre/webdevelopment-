import java.util.*;

class Solution {
   public int searchInsert(int[] nums, int target) {
    target=0;
    int index;
    for(int i=0;i<=nums.length;i++){
            if(i==target){
                System.out.println(+indexAt());   
            }
    }

       

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {   
            nums[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(nums);
    }
}
