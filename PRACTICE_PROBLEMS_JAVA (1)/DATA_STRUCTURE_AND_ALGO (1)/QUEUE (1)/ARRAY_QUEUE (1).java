package DATA_STRUCTURE_AND_ALGO.QUEUE;

public class ARRAY_QUEUE {
    int[] queue ;
    int front;
    int rear;
    int size;

    ARRAY_QUEUE(int size){
        this.queue = new int[size];
        this.front = this.rear = -1;
        this.size = size;
    }

    void enQueue(int val){
        if(!isFull()){
            queue[++rear] = val;
            front = (front == -1 )? 0 : front;
        }
    }

    void deQueue(){
        if (!isEmpty()){
            front++;
            System.out.println("Dequeue is performed !!");
        }else {
            System.out.println("queue is already empty");
        }
    }

    int peekElement(){
        if (!isEmpty()){
            return queue[front];
        }
        return -1;
    }

    boolean isEmpty(){
        return  rear == -1;
    }

    boolean isFull(){
        return rear+1 == size;
    }

    void deleteQueue(){
        queue = null;
    }

    void printQueue(){
        if (isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        for (int i = front; i<= rear ;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ARRAY_QUEUE queue = new ARRAY_QUEUE(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.printQueue();
        System.out.println("peek element :" +queue.peekElement());
        queue.deQueue();
        System.out.println("peek element :" +queue.peekElement());
        System.out.println("is Full? "+queue.isFull());
        System.out.println("is Empty? "+queue.isEmpty());

    }
}
