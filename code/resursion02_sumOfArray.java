public class resursion02_sumOfArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,7};
        int sum=0;
        System.out.println( help(arr,0,sum));
    }
    public static int  help(int[] arr,int i,int sum){
        if(i==arr.length)
        return sum;
        sum=sum+arr[i];
        return help(arr,i+1,sum);
    }
}
