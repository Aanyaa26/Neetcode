Date:08.02.24
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap <>();
        int [] ans = new int[k];

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        

        for(int  i=0; i< k; i++){

            int maxfreq = Integer.MIN_VALUE;
            int element = -1; 

            for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>maxfreq){
                    maxfreq = entry.getValue();
                    element = entry.getKey();
                
                    
                }
                

            }
            ans[i] = element;
            map.remove(element);
        }
        return ans;
    }
}
