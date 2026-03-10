public class DPTabulation {
    static int fibdt(int n)
    {
        int[] fib=new int[8];
        if(n==0)
           return 0;
        if(n==1)
            return 1;
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];                                      
    }
    static int tribdt(int n)
    {
        int[] trib=new int[8];
        if(n==0)
           return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        trib[0]=0;
        trib[1]=1;
        trib[2]=1;
        for(int i=3;i<=n;i++)
        {
            trib[i]=trib[i-1]+trib[i-2]+trib[i-3];
        }
        return trib[n];                                      
    }
    public static void main(String[] args)
    {
        System.out.println(fibdt(7));
        System.out.println(tribdt(7));
    }           
}
