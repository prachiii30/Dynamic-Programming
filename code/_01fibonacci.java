import java.util.Arrays;

public class _01fibonacci{
    public static void main(String[] args) {
        int n=6;
        int [] dp=new int [n+1];
        Arrays.fill(dp,-1);

        System.out.println(fun(n,dp));
    }
    public static int fun(int n, int []dp){
        if(n<2){
            return n;
        }
        
          if(dp[n]!=-1)
          return dp[n];
        
       return  dp[n]=fun(n-1,dp)+fun(n-2,dp);

    
}
}