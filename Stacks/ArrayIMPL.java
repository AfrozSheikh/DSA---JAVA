

public class ArrayIMPL {
  static  class Stack {

        int idx = 0 ; 
        int arr []  = new  int [7];
        
        void push (int val ){
            if(idx == arr.length){
                System.out.println("Stack overflow");
                return ; 
            }
          
            arr[idx] = val ; 
            idx++ ; 
         }

         void display(){
            for(int i = 0 ; i<arr.length ; i++){
                System.err.print(arr[i]+" ");
            }
         }

         int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1 ; 
            }
            return arr[idx-1]; 
         }

         int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1 ; 
            }
            int top = arr[idx-1] ; 
            arr[idx-1] = 0 ; 
            idx-- ; 
            return top ;

         }
         int size(){
            return idx ; 
         }
    }
    
    public static void main(String[] args) {
        Stack st = new Stack() ; 

        st.push(4);
        st.push(5);
        st.pop() ; 
        System.out.println(st.peek()); ; 
        st.display();
       System.out.println( st.size() );; 

    }
}
