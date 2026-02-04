public class trapRainwater {
    public static int trapRainwater(int []height){
        int n=height.length;
        //calculate left boundary 
        int left_max[]= new int[n];
        left_max[0]=height[0];
        for(int i=1;i<n;i++){
        left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        //calculate right boundary
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }
        int trapwater=0;
        //loop
        for(int i=1;i<n;i++){
            //waater level (leftbound and right bound)
            int waterLevel=Math.min(left_max[i],right_max[i]);
            //trapRainwater water - height
            trapwater += waterLevel - height[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        int []height={4,2,0,6,3,2,5};
        System.out.println("Total TrapWater :   "+ trapRainwater(height));
    }   
}