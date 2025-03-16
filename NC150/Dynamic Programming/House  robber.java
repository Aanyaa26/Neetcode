Date : 16.03.25
  class Solution {
    // public int help(int i, int[]nums,int[] memo){
    //     if(i==0)return nums[0];
    //     if(i<0)return 0;
    //     if(memo[i]!=-1)return memo[i];

    //     memo[nums.length] = Math.max(nums[i]+help(i-2,nums,memo), help(i-1,nums,memo));
    //     return memo[nums.length];
    // }
    public int rob(int[] nums) {
    //     int [] memo = new int [nums.length+1];
    //     Arrays.fill(memo,-1);
    //     return help(nums.length-1,nums,memo);

    int [] dp = new int [nums.length+1];
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];

    dp[0] = nums[0];
    dp[1] = Math.max(nums[0],nums[1]);

    for(int i=2; i<nums.length; i++){
        dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
    }
    return dp[nums.length-1];
    }
}
