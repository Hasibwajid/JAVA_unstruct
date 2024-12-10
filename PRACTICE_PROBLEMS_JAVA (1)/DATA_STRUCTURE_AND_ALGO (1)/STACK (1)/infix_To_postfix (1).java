package DATA_STRUCTURE_AND_ALGO.STACK;

import java.util.Stack;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class infix_To_postfix {
    Node1 head;

    void push(int data){
        Node1 newNode = new Node1(data);

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

    String toPostfix(char[] infix1){
        char symbol ;
        String infix = String.valueOf(infix1);
        String postfix = "";

        for (int i= 0; i< infix.length() ; i++){
            symbol = infix.charAt(i);

            if (Character.isDigit(symbol) || Character.isLetter(symbol)){
                postfix += symbol;
            }
            else if (symbol == '('){
                push(symbol);
            }
            else if(symbol == ')'){
                while (peek() != '('){
                    postfix += pop();
                }
                pop();  //to remove '('
            }
            else {
                while (!isEmpty() && peek() != '(' && Prec(symbol) < Prec((char) peek())) {
                    postfix += pop();
                }
//                if symbol has highest precedence than push into stack
                push(symbol);
            }
        }

        while (!isEmpty()){
            postfix += pop();
        }

        return postfix;
    }

    int Prec(char symbol){
        if (symbol == '+' || symbol == '-'){
            return 1;
        }
        if (symbol == '*' || symbol == '/' || symbol == '%'){
            return 2;
        }
        if (symbol == '^'){
            return 3;
        }

        return 0;
    }


        public int evaluation(String postfix){
            Stack<Integer> stack = new Stack<>();
            char ch ;
            int res = 0;

            for (int i = 0 ; i< postfix.length(); i++){
                ch = postfix.charAt(i);

                if (Character.isDigit(ch) ){
                    stack.push(ch -'0');
                }
                else if (Character.isLetter(ch)){
                    System.out.println("please enter numeric values");
                    return 0;
                }
                else {
                    int op1 = stack.peek();
                    stack.pop();
                    int op2 = stack.peek();
                    stack.pop();
                    res = performOp(op2,op1, ch);
                    stack.push(res);
                }
            }
            return stack.peek();
        }

        public int performOp(int op1 , int op2, char ch){
            if (ch == '+'){
                return op1+op2;
            }
            else if(ch == '-'){
                return op1 - op2;
            }
            else if (ch == '*'){
                return op1*op2;
            }
            else if (ch == '/'){
                if (op2 != 0) {
                    return op1 / op2;
                }else {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
            }
            else if (ch == '^'){
                return (int)Math.pow(op1,op2);
            }
            else {
                return 0;
            }
        }

    String toPrefix(String infix){
        String inf1 = reverseStr2(infix);
        char[] arr = inf1.toCharArray();

        for (int i =0 ; i< inf1.length(); i++){
            if (arr[i] == '('){
                arr[i] = ')';
            }else if (arr[i] == ')'){
                arr[i] ='(';
            }
        }

        String post = toPostfix(arr);

        return reverseStr2(post);
    }

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


    public static void main(String[] args) {
        infix_To_postfix obj = new infix_To_postfix();
        System.out.println("converted to postfix");
        String s = "x+y*z/w+u";
        System.out.println(obj.toPostfix(s.toCharArray()));

        System.out.println("evaluating... from postfix");
        String postFix = obj.toPostfix(s.toCharArray());
        System.out.println(obj.evaluation(postFix));
//
        System.out.println("TO PRE_FIX: ");
        System.out.println(obj.toPrefix(s));
    }

}
