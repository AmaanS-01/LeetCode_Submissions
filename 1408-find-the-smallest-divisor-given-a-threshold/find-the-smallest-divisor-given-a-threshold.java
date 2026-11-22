class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     int r=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>r)r=nums[i];
     }   
     int l=1;
     int ans=1;
     while(l<=r){
        int mid=l+(r-l)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        if(sum<=threshold){
            ans=mid;
            r=mid-1;
        }
        else l=mid+1;
     }
     return ans;

    }
}