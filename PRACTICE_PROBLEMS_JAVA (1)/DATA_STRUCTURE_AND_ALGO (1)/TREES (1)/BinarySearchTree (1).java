
package DATA_STRUCTURE_AND_ALGO.TREES;

import java.util.*;


class Node2{
    Node2 left , right;
    int data;
    public Node2(int val){
        this.data =val;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    static Node2 root;
    
    void insert(int val){
        if (root == null) {
            root = new Node2(val);
            return;
        }
        
        insert(root, val);
    }
    
    private Node2 insert(Node2 root, int val){
        if (root == null) {
            Node2 newNode = new Node2(val);
            return newNode;
        }else if(val > root.data){
            root.right = insert(root.right, val);
        }else if( val < root.data){
            root.left = insert(root.left, val);
        }

        return root;
    }
    
    private void search(int val){
        search(val,root);
    }
    
    private void search(int val, Node2 root){
        if(root == null){
            System.out.println("The seach value was not found");
        }
        else if(val > root.data){
            search(val, root.left);
        }
        else if(val < root.data){
            search(val, root.right);
        }
        else {
            System.out.println("val "+root.data +" is present in the tree!");
        }
        
    }
    
    
    private void delete(int val){
        DeleteNode(root, val);
    }
    private Node2 DeleteNode(Node2 root, int val){
        if(root == null){
            System.out.println("Node to delete not found!");
            return null;
        }
        
        if(val < root.data){
            root.left = DeleteNode(root.left, val);
        }
        else if( val > root.data){
            root.right = DeleteNode(root.right, val);
        }
        else{
            if(root.left != null && root.right != null){
                Node2 minNodeFromRight = getMinNode(root.right);
                root.data = minNodeFromRight.data;
                root.right = DeleteNode(root.right , minNodeFromRight.data);
        }
            else if( root.left != null){
                root = root.left;
            }
            else if( root.right != null){
                root = root.right;
            }
            
            else{
                root = null;
            }
        }
        return root;
    }
    
    private Node2 getMinNode(Node2 root){
        if(root.left == null){
            return root;
        }
        return getMinNode(root.left);
    }
    
    private void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node2 root){
       if(root == null){
           return ;
       }
       
       inOrder(root.left);
       System.out.println(root.data);
       inOrder(root.right);
   }

    //    levelOrder
    public static void levelOrder(){
        levelOrder(root);
    }
    private static void levelOrder(Node2 root){
        if (root == null){
            return;
        }

        Queue<Node2 > queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node2 curr = queue.remove();


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
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(33);
        bst.insert(43);
        bst.insert(53);
        bst.insert(13);
        bst.insert(3);
        bst.delete(55);
        levelOrder();
        bst.search(1);
    }
    
}
