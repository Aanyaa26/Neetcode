Date: 18.02.24
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
 
    }
}
