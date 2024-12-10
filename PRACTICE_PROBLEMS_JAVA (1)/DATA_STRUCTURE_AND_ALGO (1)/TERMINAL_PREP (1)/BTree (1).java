package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node_T{
    Node_T left, right ;
    int data;

    public Node_T(int val){
        this.data = val;
        this.left =null;
        this.right = null;
    }
}
public class BTree {
    Node_T root;

    public void insert(int val){
        if (root == null) {
            root = new Node_T(val);
            return;
        }

        Queue<Node_T> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node_T curr = queue.remove();

            if (curr.left != null){
                queue.add(curr.left);
            }else {
                curr.left = new Node_T(val);
                return;
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }else {
                curr.right = new Node_T(val);
                return;
            }

        }
    }


    //deletion position will be replaced by deepest node
//    and then delete node at deepest position
    public void delete(int val){
        if (root == null) {
            return;
        }

        Queue<Node_T> queue = new LinkedList<>();
        queue.add(root);

        Node_T nodeToDelete ;
        while (!queue.isEmpty()) {
            Node_T curr = queue.remove();

            if (curr.data == val) {
                nodeToDelete = curr;

                Node_T deepest = getDeepestNode();
                assert deepest != null;
                nodeToDelete.data = deepest.data;

                deleteDeepestNode();
                break;
            }

            if (curr.left != null) {
                queue.add(curr.left);
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }
    private void deleteDeepestNode() {
        if (root != null){
            Queue<Node_T > queue = new LinkedList<>();
            queue.add(root);

            Node_T deepest = getDeepestNode();

            while (!queue.isEmpty()) {
                Node_T curr = queue.remove();

                if (curr.left == deepest) {
                    curr.left = null;
                }else if(curr.right == deepest){
                    curr.right = null;
                }
                else {
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right!= null){
                        queue.add(curr.right);
                    }
                }
            }

        }
    }

    private Node_T getDeepestNode(){
        if (root == null) {
            return null;
        }

        Node_T deepestNode = root ;
        Queue<Node_T > queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node_T curr = queue.remove();

            if (curr.left != null){
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }

            deepestNode = curr;
        }
        return deepestNode;
    }


    public void search(int val){
        if (root ==null){
            System.out.println("there is an empty tree");
            return;
        }
        boolean found = false;

        Queue<Node_T> queue= new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node_T curr = queue.remove();

            if (curr.data == val){
                System.out.println(curr.data+" found in tree");
                found = true;
                break;
            }
            else {
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }

        if (!found)
            System.out.println(val+ " not found in tree");
    }

    public  void levelOrder(){
        if (root == null) {
            return;
        }
        Queue<Node_T > queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node_T curr = queue.remove();
            if (curr == null) {
                System.out.println();

                if (!queue.isEmpty()){
                    queue.add(null);
                }
            }else {
                System.out.print(curr.data + "  ");

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
        BTree o = new BTree();
        int[] arr = {112,102,12,44,21,42,12};

        Arrays.sort(arr);

        for (int i: arr){
            o.insert(i);
        }
        o.levelOrder();


        o.delete(44);
        System.out.println("After deleting 44 : ");
        o.levelOrder();

        o.search(32);
    }
}

