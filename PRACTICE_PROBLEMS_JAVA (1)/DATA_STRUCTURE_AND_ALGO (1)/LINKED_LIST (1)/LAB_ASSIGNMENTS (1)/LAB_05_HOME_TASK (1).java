package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class LAB_05_HOME_TASK {
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

            if (Character.isLetterOrDigit(symbol)){
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

    int evaluateFromPostfix(String postfix){
        LAB_05_HOME_TASK obj = new LAB_05_HOME_TASK();
        char symbol;
        int f ,s ;
        int res ;

        for (int i =0 ; i < postfix.length(); i++){
            symbol = postfix.charAt(i);

            if ( Character.isDigit(symbol)){
                //to convert char into int just - '0' (ascii of 0)
                obj.push(symbol- '0');
            }
            else if (symbol == '+'){
                s = obj.pop();
                f = obj.pop();
                res = f + s;
                obj.push(res);
            }else if (symbol == '-'){
                s = obj.pop();
                f = obj.pop();
                res = f-s;
                obj.push(res);
            }else if (symbol == '/'){
                s = obj.pop();
                f = obj.pop();
                res = f/s;
                obj.push(res);
            }else if (symbol == '%'){
                s = obj.pop();
                f = obj.pop();
                res = f%s;
                obj.push(res);
            }else if (symbol == '*'){
                s = obj.pop();
                f = obj.pop();
                res = f*s;
                obj.push(res);
            }else if (symbol == '^'){
                s = obj.pop();
                f = obj.pop();
                res = (int) Math.pow(f,s);
                obj.push(res);
            }

        }

        return obj.pop();
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
        LAB_05_HOME_TASK obj = new LAB_05_HOME_TASK();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Expression either with or without parenthesis: ");

        String s = scan.nextLine();

        System.out.println("\nQUESSTION>> IN_FIX TO POST_FIX: ");
        System.out.println(obj.toPostfix(s.toCharArray()));

        System.out.println("\nQUESSTION>> EVALUATION OF POST_FIX EXPRESSION: ");
        System.out.println("NOTE: evaluation is based on ascii values of characters if not digits were given: ");
        String postFix = obj.toPostfix(s.toCharArray());
        System.out.println(obj.evaluateFromPostfix(postFix));


        System.out.println("\nQUESSTION>> IN_FIX TO PRE_FIX: ");
        System.out.println(obj.toPrefix(s));
    }

}
