public class subArrays {
    public static void subArray(int nums[]){
        int ts=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;

                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray : "+ts);
    }

    public static void subArraysSum(int nums[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                   currsum += nums[k];
                }
                if(maxSum<currsum){
                    maxSum=currsum;
                }
                System.out.println("currSum = "+currsum);
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        subArraysSum(nums);
    }
    
}
