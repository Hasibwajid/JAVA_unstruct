package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;

class Node_C {
    Node_C next;
    int data;
    Node_C previous;


    Node_C(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
public class LAB_04_HOME_TASK {
    int size ;
    Node_C head;
    Node_C tail;
    Node_C previous;


    void insert(int data, int loc){
        Node_C newNode = new Node_C(data);
        if (head == null){
            tail = head = newNode;
            newNode.next = head;
            head.previous = newNode;
        }
        else if(loc <= 0){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }else if (loc >= size){
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = head;
            head.previous = tail;
        }else{
            Node_C temp = head;
            int count = 0;
            while (count < loc - 1 ){
                temp = temp.next;
                count++;
            }
            Node_C nextNode = temp.next;
            temp.next = newNode;
            newNode.previous = temp;
            newNode.next = nextNode;
            nextNode.previous = newNode;
        }

        size++;
    }

    void reverse(){
        Node_C temp = tail;
        while (temp != head){
            System.out.print(temp.data+" ");
            temp = temp.previous;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    void display(){
        Node_C temp = head;

        while (temp != tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }


    void evenOdd(){
        Node_C temp = head;
        Node_C end = tail;

        while (temp.next != tail.next){
            if (temp.data % 2 != 0) {
//                agr odd number first position me ho
                if (temp == head) {
                    head = head.next;
                    Node_C last = temp;
                    end.next = last;
                    last.previous = end;
                    last.next = null;
                    end = last;
                    temp = head;
                }
                else
                {
                    Node_C prev = head;
                    while (prev.next.data != temp.data){
                        prev = prev.next;
                    }
                    Node_C odd = temp;
                    prev.next = odd.next;
                    odd.next.previous = prev;
                    end.next = odd;
                    odd.previous = end;
                    odd.next = null;
                    end = odd;

                    temp = prev;
                }
            }
            temp = temp.next;
        }
        tail = end;
    }

    void odd_even_sums(){
        Node_C temp = head;
        int evenSum = 0;
        int oddSum = 0;
        while( temp != tail.next){
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
        LAB_04_HOME_TASK cll = new LAB_04_HOME_TASK();
        cll.insert(0,0);
        cll.insert(1,2);
        cll.insert(4,5);
        cll.insert(3,6);
        cll.insert(8,8);
        cll.insert(11,8);

        cll.display();

        System.out.println("REverse of circular ll: ");
        cll.reverse();
        System.out.println("EVen Odd grouping: ");
        cll.evenOdd();
        cll.display();

        cll.odd_even_sums();
    }
}
