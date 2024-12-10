package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;



import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 left, right;

    public Node4(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SortBinaryTree {

    static Node4 root = null;
    static int idx =-1;


    public static void insert(int key){
        Node4 node = new Node4(key);
            if(root == null){
                root = node;
                return;
            }
            Queue<Node4> queue = new LinkedList<>();
            queue.add(root);
            while(!(queue.isEmpty())){
                Node4 currNode = queue.remove();
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
    public static void LevelOrderTraversal(Node4 root, int[] arr){
        int index = 0;
        if (root == null) {
            return;
        }
        Queue<Node4> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node4 currNode =q.remove();
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
        Node4 node = new Node4(value);
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node4> queue = new LinkedList<>();
        queue.add(root);
        while (!(queue.isEmpty())) {
            Node4 currentNode = queue.remove();
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
