package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;
import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    Node2 left, right ;
    int data ,height;

    public Node2(int data){
        this.left= null;
        this.right = null;
        this.data = data;
        this.height = 1;
    }
}

public class AVL {
    Node2 root ;

    private int height (Node2 n){
        if (n == null) {
            return 0;
        }
        return n.height;
    }


    private int max(int a, int b) {
        return Math.max(a, b);
    }


    private Node2 leftRotate(Node2 n){
        Node2 x = n.right;
        Node2 t2 = x.left;
        x.left = n;
        n.right = t2;
        x.height = max(height(x.left), height(x.right))+1;
        n.height = max(height(n.left), height(n.right))+1;
        return x;
    }

    private Node2 rightRotate(Node2 n){
        Node2 x = n.left;
        Node2 t2 = x.right;
        x.right = n;
        n.left = t2;
        x.height = max(height(x.left), height(x.right))+1;
        n.height = max(height(n.left), height(n.right))+1;
        return x;
    }

    private int getBF(Node2 node){
        if (node == null){
            return 0;
        }
        return (height(node.left) - height(node.right));
    }


    public void insert(int d){
        root =  insert(root, d);
    }
    private Node2 insert(Node2 root,int d){
        if (root == null){
            return (new Node2(d));
        }
        if (root.data > d){
            root.left = insert(root.left, d);
        }
        else if (root.data < d) {
            root.right = insert(root.right, d);
        }
        else {
            return root;
        }
        root.height = 1+ max(height(root.left), height(root.right));
        int bF = getBF(root);

        if (bF > 1){
            if (d > root.left.data){
                root.left  = leftRotate(root.left);
                return rightRotate(root);
            }
            else if (d < root.data){
                return rightRotate(root);
            }
        }
        if (bF < -1){
            if (d < root.right.data){
                root.right  = rightRotate(root.right);
                return leftRotate(root);
            }
            else if (d > root.data){
                return leftRotate(root);
            }
        }
        return root;
    }


    public void deleteNode( int val){
        DeleteNode(root,val);
    }
//    PROCEDURE: First, apply standard deletion of BST the check BF if !balanced then balance the AVL tree
    private Node2 DeleteNode(Node2 root, int val){
        if (root== null){
            return null;
        }
        else if (val < root.data){
            DeleteNode(root.left,val);
        }
        else if (val > root.data){
            DeleteNode(root.right, val);
        }
        else {
            if (root.left != null && root.right != null) {
                Node2 min = getMinNode(root.right);
                root.data = min.data;
                min.data = 0;
                root.right = DeleteNode(root.right, root.data);
            }
            //case 2 node with left child recursive call for left as root
            else if (root.left != null) {
                root = root.left;
            }
            //case 3 node with right child recursive call for right as root
            else if (root.right != null) {
                root = root.right;
            } else {
                return null;
            }
        }
            root.height = max(height(root.left), height(root.right)) + 1;
            int bf = getBF(root);
            if (bf > 1) {
                if( getBF(root.left) >= 0){
                    return rightRotate(root);
                } else {
                    root.left = leftRotate(root.left);
                    return rightRotate(root);
                }
            }
            if( bf < -1){
                if( getBF(root.left) <= 0){
                    return leftRotate(root);
                } else {
                    root.right = rightRotate(root.right);
                    return leftRotate(root);
                }
        }
        return root;
    }

    private Node2 getMinNode(Node2 root) {
        if (root.left == null) {
            return root;
        }
        return getMinNode(root.left);
    }

    void printTree() {
        printTree(root, "  ", true) ;
    }

    public void printTree(Node2 curPtr, String indent, boolean last) {
        if (curPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R---");
                indent += "  ";
            } else {
                System.out.print("L---");
                indent += "| ";
            }
            System.out.println(curPtr.data);
            printTree(curPtr.left, indent, false);
            printTree(curPtr.right, indent, true);
        }
    }

    public void levelOrder(){
        if (root == null){
            return;
        }
        Queue <Node2> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node2 curr = q.remove();
            if (curr == null){
                System.out.println();
                if (!q.isEmpty() ){
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data+" ");
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        AVL avl = new AVL();
        avl.insert(30);
        avl.insert(13);
        avl.insert(53);
        avl.insert(9);
        avl.insert(21);
        avl.insert(61);
        avl.insert(8);
        avl.insert(11);
        avl.insert(82);

        System.out.println("Original Tree:");
        System.out.println("------------------------------");
        avl.printTree();
        System.out.println("After Deleting:");
        System.out.println("------------------------------");
        avl.deleteNode(30);
        avl.printTree();
        System.out.println("LeVel OrDer TraVerSal :");
        avl.levelOrder();
    }
}
