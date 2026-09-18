class Solution {
    public void nextPermutation(int[] nums) {
        
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        int j=nums.length-1;
        if(i==-1){
            int k=0;
            int l=nums.length-1;
            while(k<l){
                int te=nums[k];
                nums[k]=nums[l];
                nums[l]=te;
                k++;
                l--;
            }
        }
        else{
            while(j>=0){
                if(nums[j]>nums[i])break;
            j--;}
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        int k=i+1;
        int l=nums.length-1;
        while(k<l){
            int t=nums[k];
            nums[k]=nums[l];
            nums[l]=t;
            k++;
            l--;
        }
        }
        
    }
}