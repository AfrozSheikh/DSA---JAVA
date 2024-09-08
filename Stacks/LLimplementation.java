public class LLimplementation {

    public static class  Node {
        int data ; 
        Node next ; 
        Node(int data)
        {
            this.data =data  ; 
        }
    }

    public static class Stack {
    Node head = null ; 
    
     void push (int val) {
        Node temp = new Node(val); 
        if(head==null){
        head = temp ; 
        
        }
        else{
            temp.next = head ; 
            head = temp ; 
        }
     }
     void display(){
        Node temp = head ; 
        while (temp!=null) {
            System.out.print(" "+ temp.data);
            temp = temp.next ;             
        }
     }
      
     int pop(){
       
        int data = head.data ; 
        head= head.next ; 
        return data ; 
        
     }

     int peek(){
        return head.data ; 
     }

        
    }
    public static void main(String[] args) {
        Stack s  = new Stack()   ; 
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
       
        System.out.println(s.peek());
        
    }
    
}
