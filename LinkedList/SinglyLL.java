
public class SinglyLL {

    public static class Node{
        int data ; 
        Node next ; 
        Node(int data){
            this.data = data ; 
        }
    }

    public static class linkedlist {
        Node head = null ;
         Node tail = null ; 

         void insertAtEnd(int val){

            Node temp = new Node(val) ; 
            if(head==null){
                head = temp ;
                tail = temp ; 
            }
            else{
            tail.next = temp ;
            tail = temp ; 
            }

         }

         void display(){
            Node temp = head ; 
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next ; 
                
            }
         }

         int size(){
            int length  =0 ; 
            Node temp = head ; 
            while (temp!=null) {
                length++ ; 
                temp = temp.next ; 
                
            }
            return length ; 
         }

         void insertAtBegin(int val){
            Node temp = new Node(val) ;
            if(head== null){
                head = temp ;
                 tail = temp ; 
            }
            else{
                temp.next = head ; 
                head = temp ;
            }
         }

         void insertAt(int idx, int val ){
            Node t = new Node(val) ; 

            if(idx==size()){
                insertAtEnd(val);
                return;
            }

            if(idx== 0){
                insertAtBegin(val);
                return ; 
            }

            Node temp= head ; 
            for(int i = 1 ; i<=idx-1 ; i++){
                temp= temp.next ; 
            }
            t.next = temp.next ; 
            temp.next = t ; 

         }

         void deleteAt(int idx){
            Node temp= head  ;
            if(idx==0){
                deleteAtBegin();
                return ; 
            }
            for(int i = 1 ; i<=idx-1 ; i++)
            {
                temp = temp.next ; 
            }
            temp.next = temp.next.next ; 
            tail = temp ; 
         }

         void deleteAtBegin(){
            head = head.next ; 
         }

         void deleteAtEnd(){
            Node temp = head ; 
            for(int i = 1 ; i<size()-1; i++){
                temp= temp.next ; 

            }
            tail= temp ; 
            tail.next =  null;
         }
        
    }


    public static void main(String[] args) {
        linkedlist a = new linkedlist() ; 
       ;
       
    
        a.insertAtBegin(2);
    
        a.insertAtBegin(3);
        a.insertAtBegin(4);
        a.insertAtEnd(99);
       
       a.deleteAtEnd();
      a.display();
      System.out.println();
       System.out.println(a.tail.data);
      
       
       
      
    }
}
