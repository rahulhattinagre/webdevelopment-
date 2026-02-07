
public class subArrays {
    public static void subArrays(int []nums){
        int start=0, end = nums.length-1;
        for(int i=0;i<=nums.length;i++){
            start=i;
            for(int j=i+1;j<nums.length;j++)
                end=j;
            for(int k=start;k<end;k++){
                System.out.print("("+nums[k]+")");
            }
            System.out.println();
        }
        return ;
    }
    public static void main(String[] args) {
        int [] nums={2,4,6,8,10,12};

            subArrays(nums);
    }
    
}
