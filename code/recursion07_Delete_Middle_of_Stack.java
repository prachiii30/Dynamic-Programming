import java.util.*;

public class recursion07_Delete_Middle_of_Stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        int pos=0;
        if(s.size()%2==0)
        pos=(s.size()/2)+1;
        else
        pos=(int)Math.ceil(s.size()/2.0);
        help(s,pos,1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    public static void help(Stack<Integer> s,int fix,int pos){
        if(pos==fix){
        s.pop();
        return;
        }

        int temp=s.peek();
        s.pop();
        help(s,fix,pos+1);
        s.push(temp);
    }
}
