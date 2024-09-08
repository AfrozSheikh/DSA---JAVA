package Queue;

public class LLimplementatin {
    public static class  Node {
    int data ; 
    Node next ; 
    Node(int val){
        data = val ;
    }
}

    public static class  qq  {
        Node f = null ; 
        Node r = null ; 
        int size = 0 ; 

        void add(int val){
            Node temp = new Node(val) ;
            if(f==null && r==null){
               f=temp ; 
               r= temp ; 
            }
            else{
                r.next = temp ; 
                r=r.next ; 
            }
        }
        void display(){
            Node temp = f ; 
            while (temp!=null) {
                System.out.print(" "+ temp.data);
                temp =temp.next ; 
                
            }
        }

        int remove(){
            int x = f.data ;
            f= f.next ; 
            return x ; 
        }
        
    }
    public static void main(String[] args) {
        qq a = new qq() ; 
        a.add(1);
        a.add(2);
        a.add(3);
        
        System.out.println(a.remove());
      System.out.println(a.f.data);
    }
        
    }

