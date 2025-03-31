class Solution {
    public List<Integer> partitionLabels(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int start =0;
        int end = 0;
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }   
        
        // a=8, b=5,c=7,d,e,f,g,h,i,j,k,l
        
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            end = Math.max(end, map.get(ch));
            if(i==end){
                res.add(end-start+1);
                start = i+1;
            }
        }
        return res;
    }
}