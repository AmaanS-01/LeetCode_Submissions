class Solution(object):
    def lengthOfLongestSubstring(self, s):
        l=0
        count=0
        j=0
        l1=set()
        for i in range(len(s)):
            while s[i] in l1:
                 l1.remove(s[j])
                 j=j+1
            l1.add(s[i])
            count=max(count,i-j+1)      
        return count

            
        