public class recursion04_1ToN {
    public static void main(String[] args) {
        help(7);
    }
    static void help(int n){
        if(n==0)
        return;
        help(n-1);
        System.out.println(n);
    }
    
}
