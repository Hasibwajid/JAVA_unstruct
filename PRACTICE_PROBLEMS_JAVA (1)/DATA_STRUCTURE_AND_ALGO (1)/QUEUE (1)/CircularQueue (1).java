package DATA_STRUCTURE_AND_ALGO.QUEUE;

class CircularQueue{
    int size;
    int front, rear;
    int c_queue[];

    CircularQueue(int size){
        this.size = size;
        c_queue = new int[size];
        front = rear = -1;
    }


    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return rear+1 == front || front == 0 && rear +1 == size;
    }

    public void enQueue(int val){
        if (!isFull()){
            if (rear + 1 == size ){
                rear = 0;
            }
            else if ( isEmpty()) {
                rear = front = 0;
            }
            else {
                rear++;
            }
            c_queue[rear] = val;


        }else {
            System.out.println("Circular Queue is full.");
        }
    }

    public void deQueue(){
        if (!isEmpty()){
            int res = c_queue[front];
            c_queue[front] = -1;
            if (front == rear){
                front = rear = -1;
            }
            else if (front +1 == size){
                front = 0;
            }
            else {
                front++;
                System.out.println("Dequeue is performed !!");
            }
        }else {
            System.out.println("Circular queue is empty");
        }
    }

    public int peek(){
        if (!isEmpty()) {
            return c_queue[front];
        }
        return -1;
    }

    public void print(){
        if (!isEmpty()){
            System.out.println("PRINTING QUEUE ELEMENTS: ");
            for (int i = front ;i != rear ; i = ++i % size){
                System.out.print(c_queue[i]+" ");
            }
            System.out.println(c_queue[rear]);

        }else {
            System.out.println("Circular queue is empty");
        }
    }
    public static void main(String[] args) {
        CircularQueue c_queue = new CircularQueue(4);
        c_queue.enQueue(1);
        c_queue.enQueue(2);
        c_queue.enQueue(3);
        c_queue.enQueue(4);
        System.out.println("peek : "+c_queue.peek());
        c_queue.deQueue();
        c_queue.deQueue();
        System.out.println("peek : "+c_queue.peek());
        c_queue.enQueue(22);
        c_queue.enQueue(332);
        c_queue.print();
    }
}