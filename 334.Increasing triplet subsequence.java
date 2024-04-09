class Solution {
    public boolean increasingTriplet(int[] nums) {
         int n=nums.length;
        if (nums == null || n < 3) {
            return false;
        }
       
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        
       
       
for(int i=0;i<n;i++){
            if(a>=nums[i]){
               a=nums[i];
            }
            else if(b>=nums[i]){
                b=nums[i];
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}
