package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.Queue;

public class DoubleEndedQueue {
    int[] deQue ;
    int size;
    int front;
    int rear;

    DoubleEndedQueue (int size){
        this.size = size;
        this.deQue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull(){
        return rear+1 == front || front == 0 && rear+1 == size ;
    }

    public boolean isEmpty(){
        return front == -1 ;
    }
    public void pushFront(int data){
        if(isFull()){
            System.out.println("full");
            return;
        }
        if (isEmpty()){
            rear = front = 0;
        }
        else if(front == 0 && rear + 1 != size){
            front = size -1 ;
        }
        else {
            front--;
        }
        deQue[front] = data;
    }


    public void pushRear(int data){
        if (isFull()){
            System.out.println("full");
            return;
        }
        if (isEmpty()){
            rear = front = 0;
        }
        if (rear+1 == size ){
            rear = 0;
        }
        else {
            rear++;
        }
        deQue[rear] = data;
    }

    public int popFront(){
        if (isEmpty()) {
            return -1;
        }
        int res = deQue[front];
        deQue[front] = -1;
        if (front == rear){
            front = rear = -1;
        }
        else if( front + 1 == size ){
            front = 0;
        }
        else {
            front ++;
        }
        return res;
    }

    public int popRear(){
        if (isEmpty()){
            return -1;
        }
        int res = deQue[rear];
        deQue[rear] = -1;

        if (rear == front){
            rear = front = -1;
        }
        else if( rear -1 == 0 && front != 0){
            rear = size-1;
        }
        else {
            rear--;
        }
        return res;
    }
    public static void main(String[] args) {
        DoubleEndedQueue obj = new DoubleEndedQueue(10);
        obj.pushFront(1);
        obj.pushFront(2);
        obj.pushFront(3);
        obj.pushFront(4);
        obj.pushRear(10);
        obj.pushRear(12);
        obj.pushRear(114);
        obj.pushRear(116);
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popRear());
        System.out.println(obj.popRear());
        System.out.println(obj.popRear());
        System.out.println(obj.popRear());
    }
}
