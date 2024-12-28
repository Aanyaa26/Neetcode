Date: 28.12.24

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int [] ans = new int [nums.length*2];

        for(int i=0;i<nums.length ;i++){
            ans[i]= nums[i];
            ans[i+n/2] = nums[i];
        }
        return ans;
    }
}
