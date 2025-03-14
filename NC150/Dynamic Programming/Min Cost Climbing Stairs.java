Date: 14.03.25
class Solution {
    public int minCostClimbingStairs(int[] cost) {
    //     int n =cost.length;
    //     int [] dp = new int [n+1];
    //     return Math.min(mincost(cost,n,0,dp),mincost(cost,n,1,dp));
    // }
    // public int mincost(int[] cost, int n, int i,int [] dp){
    //     if(i>=n)return 0;
    //     if(dp[i]!=0)return dp[i];

    //     dp[i]= cost[i]+Math.min(mincost(cost,n,i+1,dp),mincost(cost,n,i+2,dp));
    //     return dp[i];
    // }
    int n = cost.length;
    int [] dp = new int [n+1];

    dp[0]=0;
    dp[1]=0;

    for(int i=2; i<=n; i++){
        dp[i]= Math.min(cost[i-1]+dp[i-1],cost[i-2]+dp[i-2]);

    }
    return dp[n];
    }
}
