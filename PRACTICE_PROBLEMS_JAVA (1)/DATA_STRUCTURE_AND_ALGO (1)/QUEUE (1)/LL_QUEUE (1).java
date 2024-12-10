package DATA_STRUCTURE_AND_ALGO.QUEUE;
class Node{
    Node next ;
    int data;

    public Node(int val){
        this.next = null;
        this.data = val;
    }
}

class LL_QUEUE{
    Node head;
    Node tail;
    int size;

    public boolean isEmpty(){
        return head == null;
    }



    public void enQueue(int val){
    Node newNode = new Node(val);

    if (tail == null){
        tail = head = newNode;
        return;
    }

    tail.next = newNode;
    tail = newNode;
    size++;
    }

    public void deQueue(){
        head = head.next;
        System.out.println("Dequeue is performed !!");
        size--;
    }

    public int queueSize(){
        return size;
    }

    public int peek(){
        return head.data;
    }
    public void printQueue(){
        if (!isEmpty()){
            Node temp = head;

            System.out.println("Elements in queue are: ");
            while (temp != tail){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }else {
            System.out.println("EMpty queue");
        }
    }

            public static void main(String arg[]){
                LL_QUEUE obj = new LL_QUEUE();
                obj.enQueue(0);
                obj.enQueue(1);
                obj.enQueue(2);
                obj.enQueue(3);
                obj.enQueue(4);
                System.out.println("peek : "+obj.peek());
                System.out.println("size: "+obj.queueSize());
                obj.deQueue();
                System.out.println("peek : "+obj.peek());
                System.out.println("size: "+obj.queueSize());
                obj.printQueue();
            }
        }

