public class recursion06_largestInArray {
    public static void main(String[] args){
        int[] arr={4,5,6,2,1,33,4,5,688,-12};
        int a=help(arr,Integer.MIN_VALUE,0);
        System.out.println(a);
        int b=help2(arr,arr.length);
        System.out.println(b);
    }
    //way 1
    public static int help(int[] arr,int max,int i){
        if(i==arr.length)
        return max;

        if(arr[i]>max)
        max=arr[i];
        return help(arr,max,i+1);


    }
    //way 2
    public static int  help2(int arr[],int len){
        if(len==1)

        return arr[0];
        else
        return Math.max(help2(arr,len-1),arr[len-1]);
    }

}
