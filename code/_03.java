public class _03 {
    public int climbStairs(int n) {
        int i=1,c=0;
      int ans=cc(n,i);
      return ans;
    }
    public static int cc(int n,int i){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        else
        return cc(n-1,i+1) + cc(n-2,i+2);

    }
} 
    

