package DATA_STRUCTURE_AND_ALGO.STACK;

import java.util.Stack;

public class TO_PRE_Method_2 {
    Stack<Character> sta = new Stack<>();
    boolean isAlpha(char ch){
            return ch > 'a' && ch < 'z' || ch >'A' && ch < 'Z';
    }

    boolean isDigit(char ch){
        return ch>0 && ch<9 ;
    }

    boolean isOperator(char ch){
        return !isAlpha(ch) && ! isDigit(ch);
    }

    String infixToPostfix(char[] infix1){
        char symbol ;
        String postfix = "";
        String infix = '('+String.valueOf(infix1)+')';

        for (int i= 0; i< infix.length() ; i++){
            symbol = infix.charAt(i);

            if (Character.isDigit(symbol) || Character.isLetter(symbol)){
                postfix += symbol;
            }
            else if (symbol == '('){
                sta.push(symbol);
            }
            else if(symbol == ')'){
                while (sta.peek() != '('){
                    postfix += sta.pop();
                }
                sta.pop();  //to remove '('
            }
            else {
                while (!sta.isEmpty()  && prec(symbol) < prec((char) sta.peek()) ) {
                    postfix += sta.pop();
                }
//                if symbol has highest precedence than push into stack
                sta.push(symbol);
            }
        }

        while (!sta.isEmpty()){
            postfix += sta.pop();
        }

        return postfix;
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

        String post = infixToPostfix(arr);

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

    int prec(char ch){
        if (ch == '+' || ch == '-'){
            return 1;
        }
        if (ch == '*' || ch == '/' ){
            return 2;
        }
        if (ch == '^'){
            return 3;
        }
        return 0;
    }

    public static void main(String[] args) {
        TO_PRE_Method_2 obj = new TO_PRE_Method_2();
        String s = "x+y*z/w+u";
        System.out.println("TO POST_FIX: ");
        System.out.println(obj.infixToPostfix(s.toCharArray()));
        System.out.println("TO PRE_FIX: ");
        System.out.println(obj.toPrefix(s));
    }
}

