class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
       List<Integer> a= new ArrayList<>();
        List<Integer> b= new ArrayList<>();
          List<Integer> c= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){a.add(nums[i]);}
            else if(nums[i]==pivot){b.add(nums[i]);}
            else{c.add(nums[i]);}
           }
           
      ArrayList<Integer> combinedList = new ArrayList<>();
combinedList.addAll(a);
combinedList.addAll(b);
combinedList.addAll(c);

return  combinedList.stream().mapToInt(i -> i).toArray();

    }
}