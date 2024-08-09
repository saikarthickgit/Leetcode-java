class Solution {
    public String kthDistinct(String[] nums, int k) {
        Map<String, Integer> map=new HashMap<String, Integer>();
          for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
          }
           for(String s : nums)
        {
            if(map.get(s) == 1 && --k == 0) return s;
        }

        return "";

     
       
         
        

    }
}