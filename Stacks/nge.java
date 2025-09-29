import java.util.Stack;

public class nge {

    static int[] nextGE(int a[]){
Stack<Integer> st = new Stack<>() ; 
        int result [] = new int[a.length] ; 
        int  n = a.length ; 
        st.push(a[n-1]) ; 
        result[n-1] = -1  ; 
        for(int i = n-2 ; i>=0 ; i--){
            while (st.peek()<a[i]&& st.size()>0 ) {
                st.pop() ;
            }
            if(st.size()==0)  result[i]= -1 ; 
            else result[i] = st.peek() ; 
            st.push(a[i]) ;
        }
        return result ;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,2,4} ; 
       int x []= nextGE(a) ; 
        for (int i : x) {
            System.out.println(i);
        }

    }
}
