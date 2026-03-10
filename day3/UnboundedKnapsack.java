package day3;

public class UnboundedKnapsack {
    static int knapsack(int[] values,int[] weights,int c)
    {
        int n=values.length;
        int[][] dp=new int[n+1][c+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(weights[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-weights[i-1]]+values[i-1]);
                    System.out.println(dp[i][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                    System.out.println(dp[i][j]);
                }
            }
        }
        return dp[n][c];
    }
    public static void main(String[] args) {
        int[] values={1,10,6};
        int[] weights={3,1,2};
        int c=3;
        System.out.println(knapsack(values,weights,c));
    }
}
