package DATA_STRUCTURE_AND_ALGO.TREES;


import java.util.LinkedList;
import java.util.Queue;


class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SortBinaryTree {

    static Node root = null;
    static int idx =-1;


    public static void insert(int key){
            Node node = new Node(key);
            if(root == null){
                root = node;
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!(queue.isEmpty())){
                Node currNode = queue.remove();
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                else{
                    currNode.left = node;
                    return;
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }else{
                    currNode.right = node;
                    return;
                }
            }
    }

    public static void sortArray(int[] a){
        int temporary;
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temporary=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temporary;
                }
            }}
    }
    public static void LevelOrderTraversal(Node root, int[] arr){
        int index = 0;
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode =q.remove();
            if (currNode == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                currNode.data = arr[index++];
                System.out.print(currNode.data+" ");
                if (currNode.left!= null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }


    static void insertNode(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!(queue.isEmpty())) {
            Node currentNode = queue.remove();
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            } else {
                currentNode.left = node;
                return;
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            } else {
                currentNode.right = node;
                return;
            }
        }
    }

    public static void main(String[] args) {
       int[] nodes = {7,4,8,9,33,5,2,1};
       for (int i=0; i< nodes.length;i++) {
           insertNode(nodes[i]);
       }
       sortArray(nodes);
        System.out.println("Level Order Traversal: ");
       LevelOrderTraversal(root, nodes);
    }
}
