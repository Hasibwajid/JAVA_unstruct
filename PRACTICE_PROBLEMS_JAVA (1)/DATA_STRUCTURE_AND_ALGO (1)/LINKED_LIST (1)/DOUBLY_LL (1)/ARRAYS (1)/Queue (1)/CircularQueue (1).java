package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.Queue;

public class CircularQueue {
    int[] queue;
    int size;
    int top;
    int rear;

    public CircularQueue(int size){
        this.size = size;
        this.queue = new int[size];
        this.top = -1;
        this.rear = -1;
    }

//    main point:  if rear+1 == size then move rear to 0 index
    public void enQueue(int data){
        if (isFull()){
            return;
        }
        else if (rear +1 == size){
            rear = 0;
        }
        else if (isEmpty()){
            top = rear = 0;
        }
        else {
            ++rear;
        }
        queue[rear] = data;
    }

    public int peek(){
        if (isEmpty()) {
            return -1;
        }
        return queue[top];
    }


//    main point: if top become the last index ( top +1 == size) move it to 0 index
    public int deQuque(){
        if (isEmpty()) {
            return -1;
        }
        int res = queue[top];
        queue[top ] = -1; // -1 show position is free
        if (top == rear){
            top = rear = -1;
        }
        if (top  == size-1){
            top = 0;
        }
        else {
            top++;
        }
        return res;
    }

    public boolean isFull(){
        return rear+1 == top || top ==0 && rear +1 == size;
    }

    public boolean isEmpty(){
        return rear == -1 ;
    }

    public void  print(){
        if (isEmpty()){
            return;
        }
        for (int i = top ; i != rear ; i = (i+1)%size){
            System.out.print(queue[i]+" ");
        }
        System.out.print(queue[rear]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue(5);
        obj.enQueue(0);
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.print();
        System.out.println("peek "+ obj.peek());
        System.out.println(obj.deQuque());
        System.out.println(obj.deQuque());
        obj.enQueue(11);
        obj.enQueue(81);
        obj.print();
    }
}
