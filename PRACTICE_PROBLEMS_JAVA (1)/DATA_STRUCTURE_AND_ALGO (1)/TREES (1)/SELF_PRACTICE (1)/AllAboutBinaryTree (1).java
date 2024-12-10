package DATA_STRUCTURE_AND_ALGO.TREES.SELF_PRACTICE;


import java.util.*;

class Node{
    Node left,right;
    int data;

    public Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class AllAboutBinaryTree {
    static Node root;
    static Node root2;


//    insert
    public static void insertTree1(int val) {
        Node newNode = new Node(val);
        if (root == null){
            root  = newNode;
            return;
        }

        Queue<Node > queue= new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node curr = queue.remove();

            if (curr.left != null){
                queue.add(curr.left);
            }
            else {
                curr.left = newNode;
                return;
            }

            if (curr.right != null){
                queue.add(curr.right);
            }
            else {
                curr.right = newNode;
                return;
            }
        }
    }


    public static void insertTree2(int val) {
        Node newNode = new Node(val);
        if (root2 == null){
            root2  = newNode;
            return;
        }

        Queue<Node > queue= new LinkedList<>();
        queue.add(root2);

        while (!queue.isEmpty()){
            Node curr = queue.remove();

            if (curr.left != null){
                queue.add(curr.left);
            }
            else {
                curr.left = newNode;
                return;
            }

            if (curr.right != null){
                queue.add(curr.right);
            }
            else {
                curr.right = newNode;
                return;
            }
        }
    }


    //    inOrder
    public static void inOrder(){
        inOrder(root);
    }
    private static void inOrder(Node root){
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    //    iterative inorder
    /*public List<Integer> inorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        Deque<Node> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            //go to the left most node of the tree and keep on adding it to stack
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            //pop node that will be the inorder node
            root = stack.pop();
            //add to answer list
            list.add(root.data);
            //now that leftmost child might have right child. so make root point to right child
            root = root.right;
        }
        return list;
    }*/



//    preOrder
    public static void preOrder(){
        preOrder(root);
    }
    private static void preOrder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


//    postOrder
    public static void postOrder(){
        postOrder(root);
    }
    private static void postOrder(Node root){
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


//    levelOrder
    public static void levelOrder(){
        levelOrder(root);
    }
    private static void levelOrder(Node root){
        if (root == null){
            return;
        }

        Queue<Node > queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node curr = queue.remove();


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


//    search
    public static void search(int key){
        search(root, key);
    }
    private static void search(Node root, int key){
        Queue <Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()){
            Node curr = que.remove();

            if (curr.data == key){
                System.out.println(key+" found in tree!");
                return;
            }

            if (curr.left != null){
                que.add(curr.left);
            }

            if (curr.right != null){
                que.add( curr.right);
            }
        }

        System.out.println(key +" not found in tree!");
    }


//    Height of tree
    public static int heightOfTree(){
        return heightOfTree(root);
    }
    private static int heightOfTree(Node root){
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return (leftHeight > rightHeight)? (leftHeight+1) : (rightHeight+1);
    }


//    count of nodes
    public static int countOfNodes(){
        return countOfNodes(root);
    }
    private static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }

        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);

        return (leftCount + rightCount +1);
    }

//sum of Nodes

    public static int sumOfNodes(){
        return sumOfNodes(root);
    }
    private static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left) ;
        int rightSum = sumOfNodes(root.right);

//        System.out.println(root.data +" + "+ leftSum+" + "+rightSum+" = "+ (leftSum+rightSum +root.data));
        return (leftSum + rightSum + root.data);
    }


    public static int Diameter(){
//        T_C : O(n^2)
        return Diameter(root);
    }
    private static int Diameter(Node root){
        if (root == null) {
            return 0;
        }
        int left = Diameter(root.left);
        int right = Diameter(root.right);
        int combo = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(left , Math.max(combo,right));
    }



    static class DiaAndHeight{
        int ht ;
        int dia;

        DiaAndHeight(int h, int d){
            this.dia = d;
            this.ht = h;
        }
    }
    public static DiaAndHeight diameter2(){
        return diameter2(root);
    }
//    T_C : O(n)
    private static DiaAndHeight diameter2(Node root){
        if (root == null){
            return new DiaAndHeight(0,0);
        }

        DiaAndHeight left = diameter2(root.left);
        DiaAndHeight right = diameter2(root.right);

        int myHeight = Math.max(left.ht , right.ht) +1;

        int op1 = left.dia;
        int op2 = right.dia;
        int op3 = left.ht +right.ht +1;

        int myDia = Math.max(op1, Math.max(op2,op3));

        return new DiaAndHeight(myHeight,myDia);
    }


    public static boolean isBalanced(){
        return isBalanced(root);
    }
    private static int solve (Node root){
        if (root == null){
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);

        if ( left - right <= 1){
            return 1;
        }

        return 2;
    }
    private static boolean isBalanced(Node root){
        return solve(root) == 1;
    }


    private static boolean isIdentical(Node root1, Node root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null || root2 == null){
            return false;
        }

        return (root1.data == root2.data) && isIdentical(root1.left , root2.left) && isIdentical(root1.right , root2.right);
    }
    public static boolean isIdentical(){
//        root is tree 1 ka root/head
//        root2 is tree 2 ka root/head
        return isIdentical(root, root2);
    }


//    Driver main method
    public static void main(String[] args) {
        int[] tree1Arr = {1,3,5,7,8};
        int[] tree2Arr = {1,3,5,7,8};
        for (int i = 0 ; i< tree1Arr.length ; i++){
            insertTree1(tree1Arr[i]);
        }
        for (int i = 0 ; i< tree2Arr.length ; i++){
            insertTree2(tree2Arr[i]);
        }
        System.out.println("In order traversal: ");
        inOrder();
        System.out.println();
        System.out.println("Pre order traversal: ");
        preOrder();
        System.out.println();
        System.out.println("Post order traversal: ");
        postOrder();
        System.out.println();
        System.out.println("Level order traversal: ");
        levelOrder();
        System.out.println("Height of tree is : "+heightOfTree());
        System.out.println("count of Node in B-tree: "+ countOfNodes());
        System.out.println("sum Of Nodes present in B- tree: "+sumOfNodes());
        System.out.println("Diameter: "+diameter2().dia);
        search(10);
        System.out.println("isBalanced : "+isBalanced());
        System.out.println("is two trees are Identical: "+isIdentical());

    }
}
