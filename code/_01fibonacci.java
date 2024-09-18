/**
 * _01fibonacci
 */
public class _01fibonacci {

    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n<2)
        return n;
        else
        return fibo(n-2)+fibo(n-1);
    }
}
//0 1 1 2 3 5 8