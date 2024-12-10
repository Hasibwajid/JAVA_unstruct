package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;


import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LAB_03_HOME_TASK {

    static Node head;
    static Node tail;
    static int size;

    //  Display list
    static void Display(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //    insert node at any index
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
//            Node nextNode = temp.next;
//            temp.next = newNode;
//            newNode.next = nextNode;
        }
        size++;
    }







    //  Question 1
    static void reverseNodes(){
        Node curr = head;
        Node prev = null,  next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
}



//QUESTION NO 2

    static void evenFirst(){
        Node temp = head;
        Node end = tail;

        while (temp.next != tail.next){
            if (temp.data % 2 != 0) {
//                agr odd number first position me ho
                if (temp == head) {
                    head = head.next;
                    Node last = temp;
                    end.next = last;
                    last.next = null;
                    end = last;
                    temp = head;
                }
//                agr odd number 1 k ilawa ksi position me ho
                else
                {
                    Node prev = head;
                    while (prev.next.data != temp.data){
                        prev = prev.next;
                    }
                    Node odd = temp;
                    prev.next = odd.next;
                    end.next = odd;
                    odd.next = null;
                    end = odd;

                    temp = prev;
                }
            }
            temp = temp.next;
        }
        tail = end;
    }



    //QUESTION NO : 3

    static Node found_prev(int n){
        Node temp = head;
        Node f_prev = null ;
        while (temp.next != null){
            if ( temp.next.data == n){
                f_prev = temp;
                break;
            }
            temp = temp.next;
        }
        return f_prev;
    }

    static Node found_next(int n){
        Node temp = head;
        Node f_next = null ;
        while (temp != null){
            if ( temp.data == n){
                break;
            }
            temp = temp.next;
        }
        f_next = temp.next;

        return f_next;
    }

    static Node find_pos(int n){
        Node temp = head;
        Node f_pos = null ;
        while (temp != null){
            if ( temp.data == n){
                f_pos = temp;
                break;
            }
            temp = temp.next;
        }
        return f_pos;
    }

    static boolean is_exist(int n){
        Node temp = head;
        boolean found =false;
        while (temp != null){
            if (temp.data == n){
                found = true;
            }
            temp = temp.next;
        }
        if (!found){
            return false;
        }
        return true;
    }

    static boolean replace(int n , int n2){
//    checking if both values exist or not
        if (is_exist(n) && is_exist(n2)){
            if (n == n2){
                System.out.println("\n"+"Both are same values");
                return false;
            }
            Node temp = head;
            Node first = find_pos(n);
            Node f_n = found_next(n);
            Node f_p = found_prev(n);
            Node second = find_pos(n2);
            Node s_n = found_next(n2);
            Node s_p = found_prev(n2);

            //  replacing positions
            if (f_p == null) {
                s_p.next = first;
                first.next = s_n;
                second.next = f_n;
                s_p = null;
                head = second;
            }else {
                f_p.next = second;
                second.next = f_n;
                s_p.next = first;
                first.next = s_n;
            }
        }
        else {
            if (!is_exist(n)) {
                System.out.println("\n"+n + " is not present in list");
            }
            else {
                System.out.println("\n"+n2 + " is not present in list");
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        insertAt(0,0);
        insertAt(1,1);
        insertAt(14,2);
        insertAt(3,3);
        insertAt(12,4);
        insertAt(10,5);
        insertAt(15,6);


//        SIR KINDLY RUN EACH QUESTION SEPARATELY


        //       Question 1
       /* System.out.println("Before reversing: ");
        Display();
        reverseNodes();
        System.out.println("After reversing: ");
        Display();*/




//        QUESTION NO 2
        System.out.println("Before : ");
        Display();
        evenFirst();
        System.out.println("Even At start : ");
        Display();



//        Question 3
     /*   System.out.println("Enter First num: ");
        int n1 = s.nextInt();
        System.out.println("Enter second num: ");
        int n2 = s.nextInt();

        if (replace(n1,n2)){
            System.out.println("REPLACED: ");
            Display();
        }*/

    }
}

