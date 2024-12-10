package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.LINKEDLIST;

class Node_C{
    int data;
    Node_C next;
    Node_C previous;
    Node_C(int val){
        this.data= val;
        this.next = null;
        this.previous = null;
    }
}

public class Circular_LL {
    static Node_C head;
    static Node_C tail;
    static int size;

    static void insertAt(int data, int location){
        Node_C newNode = new Node_C(data);

        if (head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        else if (location <= 0){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            tail.next = head;
        }
        else if(location >= size){
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = head;
        }
        else {
            Node_C temp = head;
            int index = 0;
            while(index < location -1){
                temp = temp.next;
                index++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.previous = temp;
        }
        size++;
    }

    static void Display(){
        Node_C temp = head;
        while (temp != tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {
        insertAt(0,1);
        insertAt(1,2);
        insertAt(2,3);
        insertAt(3,4);
        insertAt(4,5);

        Display();

    }
}
