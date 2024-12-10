package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.Stack;

public class UsingArray {
//    LIFO
    int[] stack ;
    int top = -1;
    int size;

    public UsingArray(int size){
        this.stack = new int[size];
        this.size = size;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top >= size-1;
    }
    
    public int peek(){
        return stack[top];
    }

    public void push(int val){
        if (isFull() )
            return;
        
        stack[++top] = val;
    }

    public void print(){
        if (isEmpty())
            return;

        for (int i = 0; i <= top ; i++ ){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        UsingArray stack = new UsingArray(4);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.print();
    }
}
