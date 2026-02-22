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
    public static int size;

    // Methods
        //add()
        // remove()
        // print()
        // search()

    // ADD FIRST
    public void addFirst(int data){  // O(1)

    // step1 - create new node
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return; 
    }
    // step2 - newNode next = head
    newNode.next = head; // link

    // step3 - head = newNode
    head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


public int removeFirst(){
    if(size ==0){
        System.out.println("Linked List is empty");
        return Integer.MIN_VALUE;
    }
    else if(size ==1){
        int val = head.data;
        head = tail = null;
        size =0;
        return val;
    }
     int val = head.data;
     head = head.next;
     return val; 
    
}

public int itrSearch(int key){  // O(n)
    Node temp = head;
    int i =0;
    while(temp !=null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}
public int helper(Node head, int key){ // O(n)
    if(head == null){
        return -1;
    }
    if(head.data == key){
        return 0;
}
    int idx = helper(head.next, key);
    if(idx == -1){
        return -1;
    }
    return idx+1;
}

public int recSearch(int key){
    return helper(head,key);
}

public void reverse(){
    Node prev = null;
    Node curr = tail= head;
    Node next;

    while(curr !=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }
    head = prev;
}

public void deleteNthFromEnd(int n){
    int sz = 0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }

if(n == sz){
    head = head.next;
    return;
}
int i =1;
int iToFind = sz - n;
Node prev = head;
    while(i < iToFind){
    prev = prev.next;
    i++;
    }
    prev.next = prev.next.next; 
}

public Node findMid(Node head){  // hel[per function]
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
   System.out.println("Mid value: "+slow.data); // slow is midNode
    return slow;
}
public  boolean checkPalindrome(){
    if(head == null || head.next != null){
        return true;
    }
    // step1 - find mid
    Node midNode = findMid(head);

    // step2 - reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    
    Node rightHead = prev; // right half head
    Node leftHead = head;
// step3 - check left half and right half
    while(rightHead != null){
        if(leftHead.data != rightHead.data){
            return false;
        }
        leftHead = leftHead.next;
        rightHead = rightHead.next;
    }
    return true;
}
// cycle finding algorithm
public static boolean isCycle(){ // floyd CFA
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow  = slow.next; // +1
        fast = fast.next.next; // +2
        if(slow == fast){
            return true; // cycle exists
        }
    }
    return false; // cycle does not exist
}

public static void removeCycle(){
    // find meeting point
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null){
        slow  = slow.next; // +1
        fast = fast.next.next; // +2
        if(slow == fast){
            cycle = true; // cycle exists
            break;
        }
    }
    if(cycle == false){
        return;
    }
    // find start of cycle
    slow = head;
    Node prev = null; // last node
    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    // remove cycle -> last node next = null
    prev.next = null;
}
public void zigZag(){
    // find mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
     Node mid = slow;
    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null; // break the list into 2 halves
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
    // alternate merge - zig-zag merge
    while(left != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;
        // update
        left = nextL;
        right = nextR;
    }
}

public static void main(String args[]){
    LinkedList ll = new LinkedList();


    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.print();
    ll.zigZag();
    ll.print();

    // head = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = head.next; // cycle
    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());

    // ll.addLast(1);
    // ll.addLast(2);
    // ll.addLast(2);
    // ll.addLast(1);
    // ll.print();
    // System.out.println(ll.checkPalindrome());


    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
    
    // ll.addFirst(1);
    // ll.addFirst(2);
    // ll.addLast(2);
    // ll.addLast(5);
    // ll.add(2, 3);


    // ll.print();
    // ll.deleteNthFromEnd(3);
    // ll.print();
    // ll.removeFirst();
    // ll.print();
    // System.out.println(ll.recSearch(3));
    // System.out.println(ll.recSearch(10));
    
  }
}