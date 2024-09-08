package Queue;

import java.util.*;

public class ArrImpl {

    public static class  QUE {
        int front = -1 ; 
        int rear = -1 ; 
        int size= 0 ; 
        int arr [] = new int[10] ; 
        void add(int val){
            if(front == -1|| rear ==-1){
                front++ ; 
                rear++ ; 
                arr[front] = val ; 
                size++ ; 
                
            }
            else{
                rear++ ; 
                arr[rear] = val ; 
                size++ ;
            }
        }

        void display(){
            for(int i = front ; i<=rear ; i++){
                System.out.println(" "+arr[i]);
            }
        }

        int remove(){
           int x =arr[front++] ;
           size-- ; 
           return x ;
        }

        int peek(){
            return arr[front] ; 
        }
    
        
    }
    public static void main(String[] args) {
       
QUE a = new QUE() ; 

 


a.add(1);
a.add(3);
a.add(5);
System.out.println(a.peek());

       

    }
}
