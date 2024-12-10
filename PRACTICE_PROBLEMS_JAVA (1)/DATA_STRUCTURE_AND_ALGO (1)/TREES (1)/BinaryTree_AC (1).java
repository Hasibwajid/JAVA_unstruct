package DATA_STRUCTURE_AND_ALGO.TREES;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_AC {
    static class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


        //this func built tree and store values in it also return the rootNode of tree
        static class BinaryTree{
        static int idx = -1;
            static Node buildTree(int nodes[]){
                idx++;
                if (nodes[idx] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;//this is root
            }
        }



//        PreOrder Traversal ( TC : O(n) )                   :       DFS(Depth first Search algo)
    public static void PreOrder(Node root){
        if (root == null){
            return;
        }

        System.out.println(root.val);
        PreOrder(root.left);
        PreOrder(root.right);
    }

//    InOrder Traversal ( TC : O(n) )                   :        DFS(Depth first Search algo)
    public static void InOrder(Node root){
        if (root == null){
            return;
        }

        InOrder(root.left);
        System.out.println(root.val);
        InOrder(root.right);
    }

//    PostOrder Traversal ( TC : O(n) )                   :     DFS(Depth first Search algo)
    public static void PostOrder(Node root){
        if (root == null){
            return;
        }

        PostOrder(root.left);
        System.out.println(root.val);
        PostOrder(root.right);
    }


//    LevelOrder Traversal  ( TC : O(n) )                                 : BFS(Breadth First Search algo)
    public static void LevelOrderTraversal(Node root){
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
                System.out.print(currNode.val+" ");
                if (currNode.left!= null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }


//    Count of Nodes ( TC : O(n) )
    public static int CountOfNodes(Node root){
        if (root == null){
            return 0;
        }

        int leftCount = CountOfNodes(root.left);
        int rightCount = CountOfNodes(root.right);

        System.out.println("leftCount ("+leftCount+") +  rightCount("+rightCount+")   = "+ (leftCount+rightCount +1));

        return leftCount+rightCount +1;
    }

//    Sum of Nodes ( TC : O(n) )
    public static int SumOfNodes(Node root){
        if (root == null){
            return 0;
        }

        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);

        System.out.println(root.val +" + "+ leftSum+" + "+rightSum+" = "+ (leftSum+rightSum +root.val));
        return (leftSum+rightSum +root.val);
    }


    static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;

    }


//    Diameter: longest distance bw any two node of tree  (T . C == O(n^2) )
    static int diameter(Node root) {
        // code here

        if(root == null){
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);
        int combo = height(root.left) + height(root.right) +1;

        int result = Math.max(left , Math.max(right, combo));
        return result;
    }

//    Diameter: OPTIMIZE longest distance bw any two node of tree  (T . C == O(n) )
    static int diameterOpt(Node root) {
    return 0;
}

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);
        LevelOrderTraversal(rootNode);
        System.out.println("Count of nodes of tree: "+ CountOfNodes(rootNode));
        System.out.println("Sum of nodes of tree: "+ SumOfNodes(rootNode));
        System.out.println("Height of tree: "+ height(rootNode));
        System.out.println("Diameter of tree: "+ diameter(rootNode));
    }
}
