package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.SINGLY_LL;

class secondLL{
        static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static void addFirst (int data){
        Node newNode = new Node(data);
        Node temp = head;
        if (temp == null){
            newNode.next = null;
            temp = newNode;
        }else {
            newNode.next = temp;
            temp = newNode;
        }
    }

    static void printList(){
        Node temp = head;

        if (temp == null){
            System.out.println("The List is empty");
            return;
        }

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        head = node;
        addFirst(2);
        addFirst(2);
        addFirst(2);
        printList();
        System.out.println("not working");

    }
}