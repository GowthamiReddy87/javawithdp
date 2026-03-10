package day3;

public class Subset {
    static boolean subset(int[] nums,int c)
    {
        int n=nums.length;
        boolean[][] dp=new boolean[n+1][c+1];
            for(int i=0;i<=n;i++) {                                                  
                dp[i][0]=true;
            }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][c];
    }
    public static void main(String[] args) {
        int[] nums={2,1,3};
        int c=3;
        System.out.println(subset(nums,c));
    }
}
