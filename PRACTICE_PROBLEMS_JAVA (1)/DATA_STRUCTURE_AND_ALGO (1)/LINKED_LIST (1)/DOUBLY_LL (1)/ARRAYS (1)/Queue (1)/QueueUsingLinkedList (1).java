package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.Queue;

class Node {
    Node next ;
    int data;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public void pop(){
        if (isEmpty()) {
            return;
        }
//        System.out.println(head.data+" removed");
        head = head.next;
    }

    public void print(){
        if (isEmpty()){
            return;
        }
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        obj.insert(0);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.print();
        System.out.println(obj.peek());
        obj.pop();
        obj.print();
    }
}
