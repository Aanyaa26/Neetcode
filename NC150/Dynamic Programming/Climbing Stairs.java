Date: 14.03.25
class Solution {
    public int climbStairs(int n) {
        // ----Recursive code-----
        // if (n==1)return 1;
        // if(n==0)return 1;

        // return climbStairs(n-1)+climbStairs(n-2);

    //     -----MEMOIZATION-------
    //     int [] dp = new int [n+1];
    //     return helper(n, dp);

        
    // }
    // public int helper(int n, int [] dp){
    //     if(n==0 || n==1)return 1;

    //     if(dp[n]!=0)return dp[n];

    //     dp[n] = helper(n-1, dp)+ helper(n-2, dp);

    //     return dp[n];

    int [] dp =new int [n+1];
    if(n==0|| n==1)return 1;
    dp[0]=1;
    dp[1]=1;
    
    for(int i=2; i<=n; i++){
        dp[i]= dp[i-1]+dp[i-2];
    }
    return dp[n];
    }
}

  
