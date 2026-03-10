import java.util.Arrays;
public class DPMemosiation {
    static int[] dp;
    static int[] dp1;
    static int fibd(int n)
    {
        if(n==0)
           return 0;
        if(n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        dp[n]=fibd(n-1)+fibd(n-2);
        return dp[n];
    }
    static int tribd(int n)
    {
        if(n==0)
           return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        if(dp1[n]!=-1)
            return dp1[n];
        dp1[n]=tribd(n-1)+tribd(n-2)+tribd(n-3);
        return dp1[n];
    }

    public static void main(String[] args)
    {
         dp=new int[8];
         dp1=new int[8];
        Arrays.fill(dp,-1);
        Arrays.fill(dp13,-1);
        System.out.println(fibd(7));
        System.out.println(tribd(7));
    }
}
