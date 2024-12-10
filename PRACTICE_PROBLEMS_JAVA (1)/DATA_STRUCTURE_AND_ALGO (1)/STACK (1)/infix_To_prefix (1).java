package DATA_STRUCTURE_AND_ALGO.STACK;
class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data = data;
        this.next = null;
    }
}
public class infix_To_prefix {
    public static String reverseStr2(String str) {
    int n = str.length();
    if (n==0)
        return "";

    int l = 0 , r = n-1;
    char[] ch = str.toCharArray();

    while (l<r){
        char c = ch[l];
        ch[l] = ch[r];
        ch[r] = c;
        l++;
        r--;
    }
    return new String(ch);
}

    Node2 head;

    void push(int data){
        Node2 newNode = new Node2(data);

        newNode.next = head;
        head = newNode;
    }

    char pop(){
        if (head == null){
            return ' ';
        }
        char val = (char) head.data;
        head = head.next;
        return val;
    }

    boolean isEmpty(){
        return head == null;
    }

    int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }



    String toPrefix(String infix){
        char symbol ;
        String postfix = "";

        infix = reverseStr2(infix);


        for (int i= 0; i< infix.length() ; i++){
            symbol = infix.charAt(i);

            if (Character.isDigit(symbol) || Character.isLetter(symbol)){
                postfix += symbol;
            }
            else if (symbol == ')'){
                push(symbol);
            }
            else if(symbol == '('){
                while (peek() != ')'){
                    postfix += pop();
                }
                pop();  //to remove ')'
            }
            else {
                while (!isEmpty() && peek() != ')' && Prec(symbol) < Prec((char) peek())) {
                    postfix += pop();
                }
                //if symbol has highest precedence than push into stack
                push(symbol);
            }
        }

        while (!isEmpty()){
            postfix +=  pop();
        }

        postfix = reverseStr2(postfix);
        return postfix;
    }

    int Prec(char symbol){
        if (symbol == '+' || symbol == '-'){
            return 1;
        }
        if (symbol == '*' || symbol == '/' || symbol == '%'){
            return 2;
        }

        return 0;
    }


    public static void main(String[] args) {
        infix_To_prefix obj = new infix_To_prefix();
        System.out.println(obj.toPrefix("(2+3)*(4+5)"));
        System.out.println(obj.toPrefix("(a+b)*(c+d)"));
    }
}
