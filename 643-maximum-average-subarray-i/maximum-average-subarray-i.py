class Solution(object):
    def findMaxAverage(self, nums, k):
        total=sum(nums[0:k])
        max_sum=total
        for j in range(k,len(nums)):
            total=(total-nums[j-k])+nums[j]
            max_sum=max(max_sum,total)
        avg=float(max_sum)
        return avg/k