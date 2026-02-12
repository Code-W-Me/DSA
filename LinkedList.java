import java.util.*;
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods
        //add()
        // remove()
        // print()
        // search()

    // ADD FIRST
    public void addFirst(int data){  // O(1)

    // step1 - create new node
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return; 
    }
    // step2 - newNode next = head
    newNode.next = head; // link

    // step3 - head = newNode
    head = newNode;
    }


// ADD LAST

public static void main(String args[]){
    LinkedList ll = new LinkedList();
    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
    ll.addFirst(2);
    ll.addFirst(1);
  }
}