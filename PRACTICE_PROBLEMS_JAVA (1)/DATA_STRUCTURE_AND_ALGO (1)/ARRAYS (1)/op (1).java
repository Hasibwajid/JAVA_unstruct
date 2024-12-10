package DATA_STRUCTURE_AND_ALGO.ARRAYS;

import java.util.Scanner;
import java.util.Stack;

public class op {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  /*
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            Stack<Character> st = new Stack<>();

            for(int i =0 ; i< input.length() ; i++){
                if( input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '['){
                    st.push(input.charAt(i));
                }
                else if(input.charAt(i) == '}') {
                    if (st.contains('{')) {
                        while (st.peek() != '{') {
                            st.pop();
                        }
                        st.pop();
                    }else{
                        st.push(input.charAt(i));
                    }
                }
                else if(input.charAt(i) == ')'){
                    if (st.contains('(')) {
                        while (st.peek() != '(') {
                            st.pop();
                        }
                        st.pop();
                    }else{
                        st.push(input.charAt(i));
                    }
                }
                else if(input.charAt(i) == ']') {
                    if (st.contains('[')) {
                        while (st.peek() != '[') {
                            st.pop();
                        }
                        st.pop();
                    }else{
                        st.push(input.charAt(i));
                    }
                }
            }
            if(st.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");

            }
        }*/



//more optimize
        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> stacky = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch(input.charAt(i)) {
                        case '}' : if (stacky.peek() == '{') {
                            stacky.pop();
                        } break;
                        case ']' : if (stacky.peek() == '[') {
                            stacky.pop();
                        } break;
                        case ')' : if (stacky.peek() == '(') {
                            stacky.pop();
                        } break;
                        default: stacky.push(input.charAt(i));
                    }
                } else {
                    stacky.push(input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());
        }
    }
}

//input
/*({}[])
(({()})))
({(){}()})()({(){}()})(){()}
{}()))(()()({}}{}
}}}}
))))
{{{
(((
[]{}(){()}((())){{{}}}{()()}{{}{}}
[[]][][]
}{*/

//output
/*true
false
true
false
false
false
false
false
true
true
false*/