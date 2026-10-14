class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(hmap.containsKey(ch))hmap.put(ch,hmap.get(ch)+1);
            else hmap.put(ch,1);
        }
        StringBuilder sb=new StringBuilder();
        PriorityQueue<Character> heap=new PriorityQueue<>((a,b)->hmap.get(b)-hmap.get(a));
        for(char ch:hmap.keySet()){
            heap.add(ch);
        }
        while(!heap.isEmpty()){
           char ch = heap.poll();
           for(int i=0;i<hmap.get(ch);i++){
              sb.append(ch);
    }
}
        return  sb.toString();
    }
}