public class recursion05_ReverseString {
    public static void main(String[] args) {
        String s="baby";
      
        System.out.println( help(s,s.length()-1,""));

        //method 2 new way
        System.out.println(help2("prachi"));
       
    }
    //way 1
    static String help(String s,int i,String str){
        if(i<0)
        return str;
        str=str+s.charAt(i);
        return help(s,i-1,str);
    }

    //way 2
    static String help2(String s){
        if(s.length()==0 || s.length()==1)
        return s;
        return help2(s.substring(1))+s.charAt(0);
    }
}
