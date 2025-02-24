Date: 18.02.24
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i =0; i<nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)&& i!= map.get(temp)){
                ans[0]=Math.min(i,map.get(temp));
                ans[1] = Math.max(i,map.get(temp));
            }
        }
        return ans;
    }
}
