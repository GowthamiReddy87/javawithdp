public class Recursion{
    static int factR(int n)
    {
        if(n==0)
            return 1;
        return n * factR(n-1);           
    }
    static int fibR(int n)
    {
        if(n==0)
           return 0;
        if(n==1)
            return 1;
        return fibR(n-1) + fibR(n-2);
}
    static int trib(int n)
    {
        if(n==0)
           return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        return trib(n-1) + trib(n-2) + trib(n-3);

    }
    public static void main(String[] args) {
        int a=factR(5);
        int b=fibR(6);
        int c=trib(7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}