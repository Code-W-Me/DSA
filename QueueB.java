import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class QueueB {

//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         } 
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return s1.peek();
//     }
// }

    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            } else {
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
            } else {
                while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                top = q1.remove();
                
                q2.add(top);
            }
            } else {
                while(!q2.isEmpty()){
                top = q2.remove();
                
                q1.add(top);
            }
        }
            return top;
        }
    }
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class Queue{
    //     // static int  arr[];
    //     // static int size;
    //     // static int rear;
    //     // static int front;
    //     // Queue(int n){
    //     //     arr = new int[n];
    //     //     size = n;
    //     //     rear = -1;
    //     //     front = -1;
    //     // }
    //     static Node head = null;
    //     static Node tail = null;
    //     public static boolean isEmpty(){
    //         return head == null && tail == null;
    //     }
    //     // public static boolean ifFull(){
    //     //     return (rear+1)%size == front;
    //     // }

    //     // add function
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(head == null){
    //             head = tail = newNode;
    //             return;
    //         }
    //         tail.next = newNode;
    //         tail = newNode;
    //     }
    //     // remove function
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         int front = head.data;
    //         if(tail == head){
    //             tail = head =  null;
    //         } else {
    //             head = head.next;
    //         }
    //         return front;
    //     }
    //     // peek function
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
public static void main(String args[]){
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
    // Queue q = new Queue();

    // q.add(1);
    // q.add(2);
    // q.add(3);
    // while(!q.isEmpty()){
    //     System.out.println(q.peek());
    //     q.remove();
    // }




    // Queue<Integer> q = new LinkedList<>(); // arrayDeque Queue ka apna koi object nahi hota insted interface hota hai isliye hum linkedList ka use karte hai
    // Queue<Integer> q = new ArrayDeque<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    
    // while(!q.isEmpty()){
    //     System.out.println(q.peek());
    //     q.remove();
    // }
  }
}

