
public class recursion03_powerOfNumber {
public static void main(String[] args) {
    long ans=power(34,43);
    System.out.println(ans);
}
     
static long power(int n,int r)
{
    
   if(n==0)
   return 0;
   if(r==1)
   return n;
   if(r%2==0){
       long a= power(n,r/2);
       return (a%1000000007 * a%1000000007)%1000000007;
   }
   else{
        long a= power(n,(r-1)/2);
        return (a%1000000007 * a%1000000007 *n%1000000007)%1000000007;
   }

}
    
}