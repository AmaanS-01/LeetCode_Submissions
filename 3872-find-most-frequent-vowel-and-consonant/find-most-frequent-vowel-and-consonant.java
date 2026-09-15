class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vo = new HashMap<>();
        HashMap<Character,Integer> co = new HashMap<>();
        int maxv=0;
        int maxc=0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='a' || a=='e'||a=='i'||a=='o'||a=='u'){
                if(vo.containsKey(a)){
                    vo.put(a,vo.get(a)+1);
                }else{
                    vo.put(a,1);
                }
                maxv= Math.max(maxv,vo.get(a));
            }else{
                if(co.containsKey(a)){
                    co.put(a,co.get(a)+1);
                }else{
                    co.put(a,1);
                }
                maxc= Math.max(maxc,co.get(a));
            }
        }
        return maxc+maxv;
    }
}