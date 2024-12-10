package DATA_STRUCTURE_AND_ALGO.QUEUE;

public class deQue {
    int[] deQue;
    int size ;
    int front,front1, rear, rear1 ;

    public deQue(int size){
        front = -1;
        rear = -1;
        front1 = size;
        rear1 = size;
        deQue = new int[size];
        this.size = size;
    }

    public boolean isFull(){
        return rear == rear1 || rear +1 == size || rear1 -1 == front;
    }
    public boolean isEmpty(){
        return front == rear && front1 == rear1;
    }

    public void addFirst(int val){
        if(!isFull()){
            if (rear +1 != rear1){
                rear++;
                front = (front == -1)? 0:front;
                deQue[rear] = val;
            }else {
                System.out.println("limit reached");
            }
        }else {
            System.out.println("full deque");
        }
    }

    public void  removeFirst(){
        if (!isEmpty()){
            front++;
            System.out.println("Element Removed From First!!");
        }else {
            System.out.println("queue is already empty");
        }
    }

    public void addLast(int val){
        if(!isFull()){
            if (front1 -1 != rear){
                front1--;
                rear1 = (rear1 == size)? (size-1):rear1;
                deQue[front1] = val;
            }else {
                System.out.println("limit reached");
            }
        }else {
            System.out.println("full deque");
        }
    }

    public void  removeLast(){
        if (!isEmpty()){
            rear1--;
            System.out.println("Element Removed From Last!!");
        }else {
            System.out.println("queue is already empty");
        }
    }

    public int peekFirst(){
        if (!isEmpty()) {
            return deQue[front];
        }
        return -1;
    }

    public int peekLast(){
        if (!isEmpty()){
            return deQue[rear1];
        }
        return -1;
    }

    public void print(){
        if(!isEmpty()){
            System.out.println("ELEMENTS OF DE-QUE ARE: ");
            for (int i = front; i <= rear; i++){
                System.out.print(deQue[i]+"  ");
            }
            for (int i = front1; i <= rear1; i++) {
                System.out.print(deQue[i] + "  ");
            }

            System.out.println();
        }else {
            System.out.println("Empty De-que.");
        }
    }

    public static void main(String[] args) {
        deQue deQue = new deQue(8);
        deQue.addFirst(2);
        deQue.addFirst(3);
        deQue.addFirst(4);
        deQue.addFirst(5);
        deQue.addLast(9);
        deQue.addLast(11);
        deQue.addLast(15);
        deQue.print();
        deQue.removeLast();
        deQue.print();
        System.out.println("PEEK FIRST: "+deQue.peekFirst());
        System.out.println("PEEK LAST: "+deQue.peekLast());
    }
}
