import java.util.Stack;

public class BalancedBracket {

    static boolean isbalanced(String str){
        Stack<Character> s = new Stack<>() ; 
        for(int i =0 ;i<str.length() ; i++){
            if(str.charAt(i) =='('){
                s.push(str.charAt(i)) ; 
            }
            else if(str.charAt(i) ==')'){
                if(s.isEmpty()) return false ; 
               if(s.peek() =='('){
                    s.pop() ; 
                }
            }

        }

        if(s.isEmpty()) return true ; 
        return false ; 
    }
public static void main(String[] args) {
    String str = "(((( ))))";
    System.out.println(isbalanced(str));
}    
}
