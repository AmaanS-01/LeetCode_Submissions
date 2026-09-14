class Solution(object):
    def reverseOnlyLetters(self, s):
        li=list(s)
        l=0
        r=len(li)-1
        while(l<r):
            while((l<r) and not li[l].isalpha()):
                l+=1
            while((l<r) and not li[r].isalpha()):
                r-=1
            li[l],li[r]=li[r],li[l]
            l+=1
            r-=1
        return "".join(li)
            
                                                   
        