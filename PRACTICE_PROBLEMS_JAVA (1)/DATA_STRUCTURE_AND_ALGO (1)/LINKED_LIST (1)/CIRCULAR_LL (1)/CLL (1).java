package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.CIRCULAR_LL;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CLL {
    int size ;
    Node head;
    Node tail;


    void insert(int data, int loc){
        Node newNode = new Node(data);
        if (head == null){
            tail = head = newNode;
            newNode.next = head;
        }
        else if(loc <= 0){
            newNode.next = head;
            head = newNode;
        }else if (loc >= size){
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            Node temp = head;
            int count = 0;
            while (count < loc - 1 ){
                temp = temp.next;
                count++;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }

        size++;
    }

    void display(){
        Node temp = head;

        if (head == null){
            System.out.println("empty list");
            return;
        }
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while (temp != head );
    }

    void search(int val){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if (temp.data == val){
                System.out.println("Found at index : "+ index);
                return;
            }
            index ++;
            temp = temp.next;
        }
    }

    void delete(int ind){
        Node temp = head;

        if (ind <= 0){
            head = head.next;
            tail.next = head; // because it is circular LL
        }
        else {
            int count = 0;
            while (count < ind - 1) {
                temp = temp.next;
            }
            Node next = temp.next.next;
            temp.next = next;
        }
    }

    void reverse(){
        Node curr = head;
        Node prev = null,next;

        while (curr !=  tail){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        tail.next = head;
    }





    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insert(0,0);
        cll.insert(2,2);
        cll.insert(4,5);
        cll.insert(3,6);
        cll.insert(9,8);
//        cll.display();

        cll.search(2);

//        cll.delete(0);
//        cll.display();
        cll.display();
        cll.reverse();
        cll.display();
    }
}
