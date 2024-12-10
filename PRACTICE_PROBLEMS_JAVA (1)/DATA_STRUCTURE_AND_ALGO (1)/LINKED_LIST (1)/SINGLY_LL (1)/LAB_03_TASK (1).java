package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.SINGLY_LL;

import java.util.Scanner;

public class LAB_03_TASK {
    Node head;
    Node tail;
    int size;

    class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void insertAt(int data, int location){
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
//            Node nextNode = temp.next;
//            temp.next = newNode;
//            newNode.next = nextNode;
        }
        size++;
    }


    void Display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void printConsectiveDuplicates(){
        Node temp = head;
        System.out.println("Consective Duplicates In Linked List Are: ");
        while (temp.next != null){
            if (temp.data == temp.next.data){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    void printDuplicatesOfEach(){
        Node n = head;
        while (n != null){
            Node n2 = n.next;
            while (n2 != null){
                if (n.data == n2.data){
                    System.out.println(n.data);
                    break;
                }
                n2 = n2.next;
            }
            n = n.next;
        }
    }



    void foundAllOccurance(int val){
        Node temp = head;
        int index = 0;
        String occurIndex = " ";
        boolean found = false;
        while (temp.next != null){
            if (temp.data == val){
                found = true;
                occurIndex += index+"  ";
            }
            index++;
            temp = temp.next;
        }
        if (found){
            System.out.println("occurance of "+val+" found at index "+ occurIndex);
        }
        else {
            System.out.println("there is no occurance of "+val);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LAB_03_TASK linkedList = new LAB_03_TASK();

/*      linkedList.insertAt(0,0);
        linkedList.insertAt(2,1);
        linkedList.insertAt(14,5);
        linkedList.insertAt(3,3);
        linkedList.insertAt(15,-9);
        linkedList.insertAt(15,7);
        linkedList.insertAt(15,10);
        linkedList.insertAt(14,4);


        linkedList.Display();
        linkedList.printConsectiveDuplicates();*/

    /*
    //  2.
        linkedList.printDuplicatesOfEach();*/


//        3:
        for (int i=0; i<10; i++){
            System.out.println("Enter a value: ");
            int val = s.nextInt();
            linkedList.insertAt(val,i);
        }
        System.out.println("enter value to find its occurance: ");
        int occu = s.nextInt();
        linkedList.foundAllOccurance(occu);
    }
}
