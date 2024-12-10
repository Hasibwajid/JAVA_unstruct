package DATA_STRUCTURE_AND_ALGO.STACK;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class UsingLL {
    Node head;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void pop(){
        if (head == null){
            System.out.println("Stack underflow / empty.");
            return;
        }
        head = head.next;
    }

    int peek(){
        return head.data;
    }

    boolean isEmpty(){
       return head == null;
    }

    void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size()
    {
        Node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }

        System.out.println("size of stack is : "+size);
    }
    public static void main(String[] args) {
        UsingLL stack = new UsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Is stack empty: "+stack.isEmpty());
        System.out.println("peak element in stack is : "+stack.peek());
        stack.print();
        stack.size();
    }
}
