class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int v=target-nums[i];
            if(hmp.containsKey(v)){
                arr[0]=i;
                arr[1]=hmp.get(v);
            }
            else{
                hmp.put(nums[i],i);
            }
        }
        return arr;
        
}
}