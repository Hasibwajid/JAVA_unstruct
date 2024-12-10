//package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;
//
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class avlavl {
//    Node2 root ;
//
//
//    private int height (Node2 node){
//        if (node == null) {
//            return 0;
//        }
//        return node.height;
//    }
//
//    private int getBF(Node2 node){
//        if (node== null){
//            return 0;
//        }
//        return height(node.left) - height(node.right);
//    }
//
//    private  Node2 leftRotate(Node2 node){
//        Node2 x = node.right;
//        Node2 y = x.left;
//        node.right = y;
//        x.left = node;
//
//        node.height = Math.max(height(node.left), height(node.right))+1;
//        x.height = Math.max(height(x.left), height(x.right))+1;
//        return x;
//    }
//    private  Node2 rightRotate(Node2 node){
//        Node2 x = node.left;
//        Node2 y = x.right;
//        node.left = y;
//        x.right = node;
//
//        node.height = Math.max(height(node.left), height(node.right))+1;
//        x.height = Math.max(height(x.left), height(x.right))+1;
//        return x;
//    }
//
//
//    public void insert(int val){
//        if (root == null){
//            root = new Node2(val);
//        }
//        insert(val,root);
//    }
//    private Node2 insert(int val , Node2 node){
//        if (node == null){
//            return new Node2(val);
//        }
//        if (val > node .data){
//            node.right = insert(val,node.right);
//        }
//
//        else if(val < node.data ){
//            node.left = insert(val, node.left);
//        }
//        else {
//            return node;
//        }
//
//        node.height = Math.max(height(node.left), height(node.right)) +1;
//        int bf = getBF(node);
//        if (bf > 1) {
//            if (val > node.left.data){
//                node.left = leftRotate(node.left);
//                rightRotate(node);
//            }
//            else {
//                rightRotate(node);
//            }
//        }
//        else if (bf < -1){
//            if (val > node.right.data){
//                node.right = rightRotate(node.right);
//                leftRotate(node);
//            }else {
//                leftRotate (node);
//            }
//        }
//        return node;
//
//    }
//
//
//    public void levelOrder(){
//        if (root == null){
//            return;
//        }
//        Queue<Node2> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while (!q.isEmpty()) {
//            Node2 curr = q.remove();
//            if (curr == null) {
//                System.out.println();
//                if (!q.isEmpty()) {
//                    q.add(null);
//                }
//            } else {
//                System.out.print(curr.data + " ");
//                if (curr.left != null) {
//                    q.add(curr.left);
//                }
//                if (curr.right != null) {
//                    q.add(curr.right);
//                }
//            }
//        }}
//
//    public static void main(String[] args) {
//        avlavl avl = new avlavl();
//        avl.insert(30);
//        avl.insert(13);
//        avl.insert(53);
//        avl.insert(9);
//        avl.insert(21);
//        avl.insert(61);
//        avl.insert(8);
//        avl.insert(11);
//        avl.insert(82);
//
//        System.out.println("Original Tree:");
//        avl.levelOrder();
//    }
//}
