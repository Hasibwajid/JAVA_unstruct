package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.LINKEDLIST;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data= val;
        this.next = null;
    }
}

public class LinkedListOperation {
    static Node head;
    static Node tail;
    static int size;

    static void insertAt(int data, int location){
        Node newNode = new Node(data);

        if (head == null){
            head = tail = newNode;
            newNode.next = null;
        }
        else if (location <= 0){
            newNode.next = head;
            head = newNode;
        }
        else if(location >= size){
            tail.next = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            int index = 0;
            while(index < location -1){
                temp = temp.next;
                index++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public static void duplicates(){
        Node temp =head;
        int count = 1;
        while (temp != null) {
        Node temp2 = temp.next;
        String pos = "";

            while (temp2 != null ){
                if (temp.data == temp2.data){
                    System.out.print(temp.data+" ");
                    break;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
            }
    }

    static void groupingOddEven(){
        Node temp = head;
        Node lastNode = tail;
        while (temp.next != tail.next){
            if (temp.data % 2 != 0){
                if (temp == head) {
                    head = head.next;
                    lastNode.next = temp;
                    temp.next = null;
                    lastNode = temp;
                    temp = head;
                }
                else {
                    Node prevNode = head;

                    while (prevNode.next.data !=  temp.data){
                        prevNode = prevNode.next;
                    }
                    Node nextNode = temp.next;
                    prevNode.next = nextNode;
                    lastNode.next = temp;
                    temp.next = null;
                    lastNode = temp;
                    temp = prevNode;
                }
            }
            temp = temp.next;
        }
        tail = lastNode;
    }

    static void swapTwoNodes(int a , int b){

        if (a == b) {
            return;
        }

//        found numbs
        Node prev1 = null, prev2 = null ;

//            finding no1 Node and its next and prev locations
            Node no1 = head;
            while (no1 != null && no1.data != a){
                prev1 = no1;
                no1 = no1.next;
            }

//            finding no2 Node and its next and prev locations
            Node no2 = head;
            while (no2 != null && no2.data != b){
                prev2 = no2;
                no2 = no2.next;
            }

//            if either no 1 or no2 is not present
            if (no1 == null || no2 == null) {
                return;
            }

//          if no1 is not head of ll
            if (prev1 != null){
                prev1.next = no2;
            }
//            make no2 new head
            else {
                head = no2;
            }
//            if no2 is not head of ll
            if (prev2 != null){
                prev2.next = no1;
            }
//            make no1 new head
            else {
                head = no1;
            }

//            swap next pointers
            Node temp = no1.next;
            no1.next = no2.next;
            no2.next = temp;

            System.out.println("swapping done");


    }

    static void printMiddle(){
        Node slow = head ;
        Node fast = head;

        while (fast.next != null && fast .next .next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle of LL is: "+slow.data);
    }



    static void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        insertAt(0,0);
        insertAt(2,1);
        insertAt(4,2);
        insertAt(1,3);
        insertAt(8,4);
        insertAt(12,5);
        insertAt(11,6);
        insertAt(7,7);
        Display();
//        duplicates();
        groupingOddEven();
        Display();
        swapTwoNodes(0,7);
        Display();
        printMiddle();
    }
}
