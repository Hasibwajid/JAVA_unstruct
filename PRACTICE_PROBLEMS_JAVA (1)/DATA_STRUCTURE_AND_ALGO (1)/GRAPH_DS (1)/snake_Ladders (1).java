//package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;
//
//import java.util.Scanner;
//
//class Node {
//    helper data;
//    Node next;
//
//    Node(helper data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class queue {
//    static Node head;
//    Node tail;
//
//    public void enQueue(helper d) {
//        Node newNode = new Node(d);
//        if (head == null) {
//            head = tail = newNode;
//            return;
//        }
//        newNode.next = tail;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    public void pop() {
//        if (!isEmpty()) {
//            head = head.next;
//        }
//    }
//
//    public helper peek() {
//        if (!isEmpty()) {
//            return head.data;
//        }
//        return null;
//    }
//}
//
//
//class helper {
//    int vertex;
//    int min_moves;
//}
//
//
//public class snake_Ladders {
//
//    static Scanner scan = new Scanner(System.in);
//
//    public static int min_moves(int N) {
//
//        int[] boxes = new int[N];
////        initialize all value to -1
//        for (int i = 0; i < N; i++)
//            boxes[i] = -1;
//
//        System.out.println("Enter num of ladders:");
//        int lad = scan.nextInt();
//        System.out.println("Enter num of snakes:");
//        int snake = scan.nextInt();
//
//
////        get snakes and ladder from user and update values in array as per ladders and snakes positions
//        for (int i = 0; i < lad; i++) {
//            System.out.println("ladder start: ");
//            int u = scan.nextInt();
//            System.out.println("ladder end: ");
//            int v = scan.nextInt();
//            boxes[u] = v;
//        }
//        for (int i = 0; i < snake; i++) {
//            System.out.println("snake start pos: ");
//            int u = scan.nextInt();
//            System.out.println("snake end pos: ");
//            int v = scan.nextInt();
//            boxes[u] = v;
//        }
//
////        start traversal
//
//        Boolean[] visited = new Boolean[N];
//        queue queue = new queue();
//        helper helper = new helper();
//
//
//        for (int i =0 ;i < N; i++){
//            visited[i] = false;
//        }
//
//        helper.vertex = 0;
//        helper.min_moves = 0;
//
//
//        visited[0] = true;
//        queue.enQueue(helper);
//
//        while (!queue.isEmpty()) {
//            helper = queue.peek();
//            queue.pop();
//            int v = helper.vertex;
//            System.out.println("vertex get "+v+" dist get "+helper.min_moves);
//
//            if (v == N-1)
//                break;
//
//            for (int j = v + 1; j <= (v + 6) && j < N; ++j) {
//                if (!visited[j]) {
//                    helper a = new helper();
//
//                    a.min_moves = (helper.min_moves + 1);
////                    System.out.print(j+"-->"+a.min_moves+"  "+qe.min_moves);
//                    visited[j] = true;
//
////                    if position is either of snake or ladder then make it our current vertex
//                    if (boxes[j] != -1)
//                        a.vertex = boxes[j];
//                    else
//                        a.vertex = j;
////                    System.out.print(" vertex::"+a.vertex+"\n");
//                    queue.enQueue(a);
//                }
//            }
//        }
//        return helper.min_moves;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println("Enter destination box (N) ? e.g: (100) ");
//        int N = scan.nextInt();
//        System.out.println("min moves to reach " + N + " are: " + min_moves(N));
//
//
////        sample input  ::  1
////        N = 100
////        //num of ladders  :  2  , //num of snakes : 3
////        ladders : 3 90 56 76
////        snakes : 99 10 30 20 20 5
////        ans = 3
//
//
////        sample input  ::  2
////        N = 30
////        //num of ladders  :  4  , //num of snakes : 4
////        ladders : 2 21 4 7 10 25 19 28
////        snakes  :  26 0 20 8 16 3 18 6
////        ans = 4
//
//    }
//}
