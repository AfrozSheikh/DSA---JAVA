

public class findingNthNodefromEnd {
    public static class Node {
        int data ; 
        Node next ; 
        Node(int val ){
            data = val ; 
        } 
    }

    public static class LL {
        Node head = null ; 
        Node tail = null ;
        int size = 0 ; 
         void insert(int data){
            Node temp = new Node(data); 
            if(head ==null){
                head= temp ; tail= temp ; 
                size++ ; 
            }
            else{
                tail.next= temp ; 
                tail =temp ; 
                size++ ;
            }
         }

         void display(){
            Node temp = head ; 
            while(temp!=null){
                System.out.println(" "+temp.data);
                temp = temp.next ; 
            }
         }
        void nthNodefromEnd(int n){
        //     Node temp = head ; 
        //     int sz = size ; 
        //     int x = size-n ; 
        //    for(int i = 0 ; i<x ;i++){
        //     temp = temp.next ; 

        //    }
        //    return temp.data ;

        Node f = head ; 
        Node s = head ;
        for(int i = 1 ; i<n ; i++){
            s=s.next ;
        }
        while (s.next!=null) {
            f= f.next ; 
            s =s.next ;
            
        }
            f.data= f.next.data ; 
         f.next = f.next.next ; 
        }
    
        
    }
    public static void main(String[] args) {
        LL a = new LL() ; 
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.insert(6);
        a.insert(7);
        
       a.nthNodefromEnd(2);
       a.display(); 
        
    }
}
