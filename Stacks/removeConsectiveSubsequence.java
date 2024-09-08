import java.util.Stack;

public class removeConsectiveSubsequence {
    
    static int[] remove(int arr[]){
        Stack<Integer> s = new Stack<>() ; 
        int n = arr.length ; 
        for(int i =0 ; i<n ; i++){
            
           
                if(s.size()==0 || s.peek() != arr[i]) s.push(arr[i]) ; 
                else if(arr[i]==s.peek()){
                    if(i== n-1 || arr[i] !=arr[i+1]) { s.pop() ; }
                }
            
        }
        int ans[] = new int[s.size()] ; 
        for(int i = ans.length-1 ; i>=0 ; i--){
            ans[i] = s.pop()  ; 
        }
        return ans ; 
    }
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,10,10,4,4,5,7,7,2} ;
        int res [] =remove(arr) ; 
        
        for(int i = 0 ; i<res.length ; i++){
            System.out.println(res[i]);
        }
        

}
}
