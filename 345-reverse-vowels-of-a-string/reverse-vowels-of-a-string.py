class Solution(object):
    def reverseVowels(self, s):
        st=list(s)
        vowels="aeiouAEIOU"
        i=0
        j=len(st)-1
        while i<j:
            if st[i] not in vowels:
                i+=1
                continue
            if st[j] not in vowels:
                j-=1
                continue

            st[i],st[j]=st[j],st[i]
            i+=1
            j-=1
        return "".join(st)