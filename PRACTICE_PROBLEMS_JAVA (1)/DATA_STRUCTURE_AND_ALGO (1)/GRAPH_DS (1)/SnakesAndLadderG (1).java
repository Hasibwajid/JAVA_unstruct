package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node {
    helper data;
    Node next;

    Node(helper data) {
        this.data = data;
        this.next = null;
    }
}

class queue {
    static Node head;
    Node tail;

    public void enQueue(helper d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public helper peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }
}

class helper
{
    int vertex;
    int min_moves;
}
public class SnakesAndLadderG {

    static Scanner scan = new Scanner(System.in);

    public static int min_moves(int N){
        int[] moves = new int[N];

//        initialize all value to -1 initially
        for (int i = 0 ; i < N; i++)
            moves[i] = -1;

        System.out.println("Enter num of ladders:");
        int lad = scan.nextInt();
        System.out.println("Enter num of snakes:");
        int snake = scan.nextInt();


        for (int i = 0 ; i< lad ; i++){
            System.out.println("ladder start: ");
            int u = scan.nextInt();
            System.out.println("ladder end: ");
            int v = scan.nextInt();
            moves[u] = v;
        }
        for (int i = 0 ; i< snake ; i++){
            System.out.println("snake start pos: ");
            int u = scan.nextInt();
            System.out.println("snake end pos: ");
            int v = scan.nextInt();
            moves[u] = v;
        }


//        start traversal
        int[] visited = new int[N];
        Queue<helper> q= new LinkedList<>();
        helper qe = new helper();

        qe.vertex = 0;
        qe.min_moves = 0;

        q.add(qe);

        visited[0] = 1;

        while (!q.isEmpty())
        {
            qe = q.remove();// update fetched vertex from queue here
            int v = qe.vertex;

            if (v == N-1)
                break;

            for (int j = v + 1; j <= (v + 6) && j < N; j++)
            {
                // If this cell is already visited, then ignore
                if (visited[j] == 0)
                {
                    // Otherwise calculate its distance and
                    // mark it as visited
                    helper a = new helper();
                    a.min_moves = (qe.min_moves + 1);

                    visited[j] = 1;

                    if (moves[j] != -1)
                        a.vertex = moves[j];
                    else
                        a.vertex = j;

                    q.add(a);
                }
            }
        }
        return qe.min_moves;
    }


    public static void main(String[] args) {
        System.out.println("Enter destination box (N) ? e.g: (100) ");
        int N = scan.nextInt();
        System.out.println("min moves to reach "+N+" are: "+min_moves(N));


//        sample input  ::  1
//        N = 30
//        //num of ladders  :  4  , //num of snakes : 4
//        ladders : 2 21 4 7 10 25 19 28
//        snakes  :  26 0 20 8 16 3 18 6
//        ans = 3


//        sample input  ::  2
//        N = 100
//        //num of ladders  :  6  , //num of snakes : 6
//        4 56 12 50 54 88 14 55 22 58 41 79 47 16 75 32 94 71 96 42 28 10 37 3
//        ans = 5 to reach 99 starting from 0

    }
}