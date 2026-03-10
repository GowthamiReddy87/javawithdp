public class SpaceEfficient {
     static int fibd(int n)
     {
            if(n==0)
                return 0;
            if(n==1)
                return 1;
            int prev2=0;
            int prev1=1;
            for(int i=2;i<=n;i++)
            {
                int curr=prev1+prev2;
                prev2=prev1;
                prev1=curr;
            }
            return prev1;                                      
     }
     static int tribd(int n)
     {
            if(n==0)
                return 0;
            if(n==1)
                return 1;
            if(n==2)
                return 1;
            int prev3=0;
            int prev2=1;
            int prev1=1;
            for(int i=3;i<=n;i++)
            {
                int curr=prev1+prev2+prev3;
                prev3=prev2;
                prev2=prev1;
                prev1=curr;
            }
            return prev1;                                      
     }
     public static void main(String[] args)
     {
         System.out.println(fibd(7));
         System.out.println(tribd(7));
     }  
}
