public class MergeSortLl {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print Linked List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        temp.next = (head1 != null) ? head1 : head2;

        return dummy.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    public static void main(String[] args) {
        MergeSortLl ll = new MergeSortLl();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(5); 

        ll.print();

        ll.head = ll.mergeSort(ll.head);

        ll.print();
    }
}