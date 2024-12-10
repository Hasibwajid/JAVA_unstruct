package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.LINKEDLIST;



    class Node_D{
        int data;
        Node_D next;
        Node_D previous;
        Node_D(int val){
            this.data= val;
            this.next = null;
            this.previous = null;
        }
    }

public class D_LinkedList {
    static Node_D head;
    static Node_D tail;
    static int size;

        static void insertAt(int data, int location){
            Node_D newNode = new Node_D(data);

            if (head == null){
                head = tail = newNode;
//                newNode.next = null;
                return;
            }
            else if (location <= 0){
                newNode.next = head;
                head.previous = newNode;
                head = newNode;
            }
            else if(location >= size){
                tail.next = newNode;
                newNode.previous = tail;
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
                newNode.previous = temp;
            }
            size++;
        }

        public static void duplicates(){
            Node_D temp =head;
            int count = 1;
            while (temp != null) {
                Node_D temp2 = temp.next;
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
            Node_D temp = head;
            Node_D lastNode = tail;
            while (temp.next != tail.next){
                if (temp.data % 2 != 0){
                    if (temp == head) {
                        head = head.next;
                        lastNode.next = temp;
                        temp.previous = lastNode;
                        temp.next = null;
                        lastNode = temp;
                        temp = head;
                    }
                    else {
                        Node_D prevNode = head;

                        while (prevNode.next.data !=  temp.data){
                            prevNode = prevNode.next;
                        }
                        Node_D nextNode = temp.next;
                        prevNode.next = nextNode;
                        nextNode.previous = prevNode.next;
                        lastNode.next = temp;
                        temp.previous = lastNode;
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

            Node_D first = head;
            while (first != null && first.data != a){
                first = first.next;
            }
            Node_D second = head;
            while (second != null && second.data != b){
                second = second.next;
            }

            if (first == null || second== null){
                return;
            }

            if (first.previous != null){
                first.previous.next = second;
            }else {
                head = second;
            }
            if (second.previous != null){
                second.previous.next = first;
            }
            else {
                head = first;
            }

            Node_D temp = first.next ;
            first.next = second.next;
            second.next = temp;

            System.out.println("swapping done");


        }

        static void printMiddle(){
            Node_D slow = head ;
            Node_D fast = head;

            while (fast.next != null && fast.next.next != null ){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("Middle of LL is: "+slow.data);
        }



        static void Display(){
            Node_D temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
        insertAt(0,1);
        insertAt(1,2);
        insertAt(2,3);
        insertAt(3,4);
        insertAt(4,5);

            groupingOddEven();
            Display();
            swapTwoNodes(0,3);
            Display();
            printMiddle();
    }
}
