public class _03climbingStairs {
    public static void main(String[] args) {

    //     int i=1,c=0;
    //   int ans=cc(5,i);
    //   System.out.println(ans);
    // }
    // public static int cc(int n,int i){
    //     if(n<0){
    //         return 0;
    //     }
    //     else if(n==0){
    //         return 1;
    //     }
    //     else
    //     return cc(n-1,i+1) + cc(n-2,i+2);
int n=5;
    int [] dp=new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    System.out.println( dp[n]);

    }
}
