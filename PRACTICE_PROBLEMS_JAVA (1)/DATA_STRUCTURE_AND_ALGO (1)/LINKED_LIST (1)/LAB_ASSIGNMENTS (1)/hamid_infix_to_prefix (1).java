package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;

public class hamid_infix_to_prefix {
    Node head;
    Node tail;

    public void push(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("The Stack is empty!!!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node {

        int value;
        Node next;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty!!!");
            return ' ';
        }
        char val = (char) head.value;
        head = head.next;
        return val;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is empty!!! (Will return -1)");
            return -1;
        }
        return head.value;
    }


    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }


    private static String toPrefix(String infix) {
        hamid_infix_to_prefix operators = new hamid_infix_to_prefix();
        char symbol;
        String prefix = " ";
        for (int i = infix.length() - 1; i >= 0; --i) {
            char ch = infix.charAt(i);

            if (precedence(ch) > 0) {
                while (!operators.isEmpty() && precedence((char) operators.peek()) > precedence(ch)) {
                    prefix += operators.pop();
                }
                operators.push(ch);
            } else if (ch == '(') {

                char x = operators.pop();
                while (x != ')') {
                    prefix += x;
                    x = operators.pop();
                }

            } else if (ch == ')') {
                operators.push(ch);
            } else {
                prefix += ch;
            }

        }

        while (!operators.isEmpty()) {
            prefix += operators.pop();
        }

        String reversedPrefix = "";
        for (int i = prefix.length() - 1; i >= 0; i--) {
            reversedPrefix += prefix.charAt(i);
        }
        return reversedPrefix;
    }

    public static void main(String[] args) {
        System.out.println(toPrefix("(x+y)*(a+c)"));
    }
}