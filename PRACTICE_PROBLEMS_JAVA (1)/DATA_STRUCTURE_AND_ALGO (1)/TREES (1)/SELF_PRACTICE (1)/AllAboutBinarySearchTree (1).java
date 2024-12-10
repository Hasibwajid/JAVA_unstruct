package DATA_STRUCTURE_AND_ALGO.TREES.SELF_PRACTICE;

import java.util.LinkedList;
import java.util.Queue;

class Node_B {
    int data;
    Node_B left,right;

    Node_B(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class AllAboutBinarySearchTree {
    Node_B root = null;


    public void insert(int val){
         root = insert(root, val);
    }
    private Node_B insert(Node_B root, int val) {
        Node_B newN = new Node_B(val);
        if (root == null) {
            return newN;
        }

        if (val < root.data){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right , val);
        }

        return root;
    }


    public void searchIterative(int val){
        searchIterative(val, root);
    }
    public void searchIterative(int val , Node_B root){
        Node_B temp = root;
        while (temp != null){
            if (temp.data == val){
                System.out.println("Found "+val);
                return;
            }
            else if (val < temp.data){
                temp = temp.left;
            }else {
                temp = temp.right;
            }
        }
        System.out.println(val+" Not Found");
    }

    public void searchRecursive(int data){
        search(data,root);
    }
    private void search(int data,Node_B root){
        if (root == null){
            System.out.println("not Found");
            return;
        }
        if (data < root.data) {
            search(data, root.left);
        }else if (data > root.data){
            search(data,root.right);
        } else {
            System.out.println("val "+root.data +" is present in the tree!");
        }
    }


//    inorder
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node_B root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void inOrderPredecessor(int val){
        Node_B temp = root;
        boolean found = false;
        int Predecessor ;
        while (temp.right != null){
            if (temp.right.data == val){
                Predecessor = temp.data;
                System.out.println("Inorder precessor of "+val+" : "+ Predecessor);
                found = true;
            }
            if (val < temp.data ){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        if (!found) {
            System.out.println("Can't found predecessor because "+val+" Not exits in BST.");
        }
    }
    public void inOrderSuccessor(int val){
        Node_B temp = root;
        boolean found = false;
        int successor ;
        while (temp != null){
            if (temp.data == val){
                successor = temp.right.data;
                System.out.println("Inorder successor "+val+" : "+ successor);
                found = true;
            }
            if (val < temp.data ){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        if (!found) {
            System.out.println("Can't found successor because "+val+" Not exits in BST.");
        }
    }

    public Node_B maxValInBST (Node_B root){
        Node_B temp = root;
        while (temp.right != null){
            temp = temp.right;
        }
        return temp;
    }
    public Node_B miniValInBST (Node_B root){
        Node_B temp = root;
        while (temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public void Delete(int va){
        root = Delete(va, root);
    }
    private Node_B Delete(int val, Node_B root){
//        if empty tree
        if (root == null){
            System.out.println(val +" can't be deleted because not exits in BST.");
            return null;
        }
        if (val > root.data ){
            root.right = Delete(val, root.right );
        }
        else if (val < root.data){
            root.left = Delete(val, root.left);
        }
        else {
//        node with no child
            if (root.left == null && root.right == null) {
                root = null;
            }
//          node with one child
            else if (root.left == null && root.right != null) {
                root = root.right;
            }
            else if (root.left != null && root.right == null) {
                root = root.left;
            }
//            node with 2 child
            else {
                Node_B temp = root;
                Node_B min = miniValInBST(root.right);
                temp.data = min.data;
                root.right = Delete(min.data , root.right);
            }
        }
        return root;
    }



    //    levelOrder
    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node_B root){
        if (root == null){
            return;
        }

        Queue<Node_B > queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node_B curr = queue.remove();


            if (curr == null){
                System.out.println();

                if (!queue.isEmpty()){
                    queue.add(null);
                }
            }else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }



    public static void main(String[] args) {
        AllAboutBinarySearchTree obj = new AllAboutBinarySearchTree();
        System.out.println("inserting....");
        obj.insert(10);
        obj.insert(81);
        obj.insert(7);
        obj.insert(6);
        obj.insert(14);
        obj.insert(15);
        obj.insert(100);
        obj.insert(8);
        obj.insert(102);
        obj.insert(302);
        System.out.println("printing.....");
        obj.levelOrder();
//        obj.inOrder();
//        System.out.println("searching....(Iterative)");
//        obj.searchIterative(10);
//        obj.searchIterative(8);
//        System.out.println("searching....(Recursive)");
//        obj.searchRecursive(10);
//        obj.searchRecursive(8);
//        obj.inOrderPredecessor(102);
//        obj.inOrderSuccessor(102);
//        System.out.println("Maximum val in BST: "+obj.maxValInBST());
//        System.out.println("Minimum val in BST: "+obj.miniValInBST());
        System.out.println("deleting.....");
        obj.Delete(15);
        obj.Delete(100);
        obj.Delete(81);
        System.out.println("printing.....");
        obj.levelOrder();

    }
}
