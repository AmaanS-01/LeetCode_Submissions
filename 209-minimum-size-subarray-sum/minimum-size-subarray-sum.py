class Solution(object):
    def minSubArrayLen(self, target, nums):
        l=0
        sumM=0
        count=len(nums)+1
        for r in range(len(nums)):
            sumM=sumM+nums[r]
            while (sumM>=target):
                sumM=sumM-nums[l]
                count=min(count,r-l+1)
                l=l+1
        if(count==len(nums)+1):
            return 0
        else:
            return count