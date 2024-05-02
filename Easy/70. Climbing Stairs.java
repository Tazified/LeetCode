class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        f(n,dp);
        return dp[n];
    }
    int f(int n,int[] dp){
        if(n==1) return 1;
        if(n==2) return 2;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = f(n-1,dp) + f(n-2,dp);
    }
}
