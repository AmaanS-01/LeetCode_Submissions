class Solution(object):
    def maxVowels(self, s, k):
        vowels="aeiou"
        n=0
        for i in range (k):
            if s[i] in vowels:
                n+=1
        max_no=n
        for i in range (k,len(s)):
            if s[i] in vowels:
                n+=1
            if s[i-k] in vowels:
                n-=1
            max_no=max(max_no,n)
        return max_no