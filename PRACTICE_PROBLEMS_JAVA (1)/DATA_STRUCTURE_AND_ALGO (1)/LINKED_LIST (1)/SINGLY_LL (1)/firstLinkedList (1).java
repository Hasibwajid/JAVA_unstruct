package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.SINGLY_LL;


public class firstLinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        firstLinkedList ll = new firstLinkedList();

//        Assign Values
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

//        Connecting nodes
        ll.head.next = second;
        second.next = third;


//        printing node-values
        while (ll.head != null){
            System.out.println(ll.head.value);
            ll.head = ll.head.next;
        }

    }
}
