package DATA_STRUCTURE_AND_ALGO.TREES.SELF_PRACTICE;


import java.util.LinkedList;
import java.util.Queue;

class NodeA {
    int data, height;
    NodeA right,left;

    public NodeA(int d){
        this.data = d;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}

public class AvlTree {
    NodeA root;



    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int height(NodeA root ){
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    private int balanceFactor(NodeA root){
        if (root == null) {
            return 0;
        }
        return height(root.left ) - height(root.right);
    }


    NodeA rightRotate(NodeA root){
        NodeA x = root.left;
        NodeA temp = x.right;
        root.left = temp;
        x. right = root;
        x.height = max(  height(x.left), height(x.right))+1;
        root.height = max(  height(root.left), height(root.right))+1;
        return x;
    }

    NodeA leftRotate(NodeA root){
        NodeA x = root.right;
        NodeA temp = x.left;
        x.left = root;
        root.right = temp;
        x.height = max(  height(x.left), height(x.right))+1;
        root.height = max(  height(root.left), height(root.right))+1;
        return x;
    }

    public void insert(int val){
        root = insert(root, val);
    }
    private NodeA insert(NodeA root, int val) {
        NodeA newN = new NodeA(val);
        if (root == null) {
            return newN;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if(val > root.data){
            root.right = insert(root.right, val);
        }else {
            return root;
        }

//        update height after insertion of element
        root.height = max(height(root.left), height(root.right)) +1;

//        calculate balance factor
        int bf = balanceFactor(root);

//        IF balance factor > 1 or -1 then we'll have 4 cases, so we have to handle each
//        Left -> left case:
        if (bf > 1 && val < root.left.data){
            return rightRotate(root);
        }
//        Left -> right case:
        if (bf > 1 && val > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

//        Right -> right case:
        if (bf < -1  && val > root.right.data){
            return leftRotate(root);
        }

//        Right -> left case:
        if (bf < -1 && val < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

//        if bf is neither > 1 nor > -1 so simply return root node
        return root;
    }


    public void levelOrder(){ levelOrder(root);}
    private void levelOrder(NodeA root){
        if (root == null){
            return;
        }

        Queue<NodeA > queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (! queue.isEmpty() ){
            NodeA curr = queue.remove();

            if (curr == null){
                System.out.println();
                if (!queue.isEmpty()){
                    queue.add(null);
                }
            }
            else {
                System.out.print(curr.data+"  ");
                if (curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        AvlTree avl = new AvlTree();
        int[]  arr = {10,20,30,40,50, 25};
        for (int j : arr) {
            avl.insert(j);
        }

        System.out.println("Our balanced(AVL) Tree is : ");
        avl.levelOrder();

    }
}
