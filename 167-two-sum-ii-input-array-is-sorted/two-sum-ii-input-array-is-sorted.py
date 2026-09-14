class Solution(object):
    def twoSum(self, numbers, target):
        n=numbers
        l=0
        r=len(n)-1
        while(l<r):
            s=n[l]+n[r]
            if(s==target):
                return [l+1,r+1]
                
            elif(s>target):
                    r-=1
            else:
                l+=1

        