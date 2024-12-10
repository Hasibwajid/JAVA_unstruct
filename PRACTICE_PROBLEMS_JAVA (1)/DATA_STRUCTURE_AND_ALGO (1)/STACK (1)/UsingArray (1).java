package DATA_STRUCTURE_AND_ALGO.STACK;

public class UsingArray {
    int[] stack;
    int top;
    UsingArray(int size){
        stack = new int[size];
        top = -1;
    }

    void push(int val){
        if (stack.length-1 == top){
            System.out.println("Stack Overflow / full");
            return;
        }
        stack[++top] = val;

    }

    void pop(){
        if (top == -1){
            System.out.println("Stack Underflow / empty");
            return;
        }
        top--;
    }

    int peek(){
        return stack[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return stack.length - 1 == top;
    }

    void print(){
        for (int i = top ; i >= 0 ; i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        UsingArray stack = new UsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.print();


    }
}
