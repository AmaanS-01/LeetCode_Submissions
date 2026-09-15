class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> hset =new HashSet<>();
      for(int num:nums){
        hset.add(num);
      }
      int max=0; 
      for(int num:hset){
        if(!hset.contains(num-1)){
            int cur=num;
            int len=0;
            while(hset.contains(cur)){
                len++;
                cur++;
            }
            max=Math.max(max,len);

        }
      }
      return max; 
    }
}