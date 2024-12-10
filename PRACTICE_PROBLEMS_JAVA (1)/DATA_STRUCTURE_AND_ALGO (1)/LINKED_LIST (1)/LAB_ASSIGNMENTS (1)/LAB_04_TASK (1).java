package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;


import java.util.Scanner;

class Node_D {
    int data;
    Node_D next;
    Node_D previous;
    Node_D(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class LAB_04_TASK {
    static Node_D head;
    static Node_D tail;
    static int size;


    //  Display list
    static void Display(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        Node_D temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //    insert node at any index
    static void insertAt(int data, int location){
        Node_D newNode = new Node_D(data);

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
            Node_D temp = head;
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


//    REVERSE DOUBLY LL
    void reverse(){
        Node_D temp = tail;

        if(tail == null){
            System.out.println("Empty");
            return;
        }

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.previous;
        }

        System.out.println("");

    }

//    GROUPING EVEN AND ODD NUMBERS
    static void evenOdd(){
            Node_D temp = head;
            Node_D end = tail;

            while (temp.next != tail.next){
                if (temp.data % 2 != 0) {
//                agr odd number first position me ho
                    if (temp == head) {
                        head = head.next;
                        Node_D last = temp;
                        end.next = last;
                        last.previous = end;
                        last.next = null;
                        end = last;
                        temp = head;
//                    temp ko wapis start per lany k liay
                    }
//                agr odd number 1 k ilawa ksi position me ho
                    else
                    {
//                    temp me odd number para hoa hy yha
                        Node_D prev = head;
//                    yh loop odd number(temp) ki previous position ko find ker k odd ki next se connect krny k liay hy
                        while (prev.next.data != temp.data){
                            prev = prev.next;
                        }
                        Node_D odd = temp;
                        prev.next = odd.next;
                        odd.next.previous = prev;
                        end.next = odd;
                        odd.previous = end;
                        odd.next = null;
                        end = odd;

                        temp = prev;//yh temp ko last odd sy phly wali position me lany k liay
                    }
                }
                temp = temp.next;
            }
            tail = end;
    }

    static  void odd_even_sums(){
        Node_D temp = head;
        int evenSum = 0;
        int oddSum = 0;
        while( temp != null){
            if (temp.data % 2 == 0 ){
               evenSum += temp.data;
            }else {
                oddSum += temp.data;
            }
            temp = temp.next;
        }

        System.out.println("Even sum is :"+evenSum);
        System.out.println("Odd sum is :"+oddSum);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        insertAt(0,0);
        insertAt(2,1);
        insertAt(14,2);
        insertAt(3,3);
        insertAt(7,4);
        insertAt(10,5);
        insertAt(15,6);

        System.out.println("EVENS AT START: ");
        evenOdd();
        Display();

        odd_even_sums();

    }
}
