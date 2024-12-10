package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.Queue;

public class QueueUsingArray {
    int top ;
    int rear ;
    int size;
    int[] queue ;

    public QueueUsingArray(int size){
        this.queue = new int[size];
        this.size = size;
        this.top = -1;
        this.rear = -1;
    }

    public void insert(int data){
        if (isFull()){
            return;
        }
        queue[++rear] = data;
        top = (top == -1) ? 0 : top;
    }

    public boolean isFull(){
        return rear == size-1;
    }
  public boolean isEmpty(){
        return rear == -1;
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return queue[top];
    }

    public void pop(){
        if (isEmpty()){
            return;
        }
        int res = queue[top];
        top = -1;
        top++;
        if (top == rear){
            top = rear = 0;
        }
//        System.out.println(queue[top]+" removed ");
        top++;
    }


    public void print(){
        if (isEmpty()){
            return;
        }
        for (int i = top ; i <= rear; i++ ){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray obj = new QueueUsingArray(5);
        obj.insert(0);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.isFull();
        obj.print();
        System.out.println(obj.peek());
        obj.pop();
        obj.print();
    }
}
