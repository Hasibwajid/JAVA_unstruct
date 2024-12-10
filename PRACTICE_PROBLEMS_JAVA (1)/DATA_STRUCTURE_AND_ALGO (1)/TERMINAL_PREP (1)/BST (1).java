package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

class Node{
    Node left,right;
    int data;

    public Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
public class BST {
    Node root;

    public void insert(int d){
        if (root == null){
            root = new Node(d);
            return;
        }

        insert(root, d);
    }
    private Node insert(Node root, int d){
        if (root == null){
            Node newN = new Node(d);
            return newN;
        }

        if (d < root.data){
            root.left = insert(root.left,d);
        }
        else if (d > root.data){
            root.right = insert(root.right, d);
        }

        return root;
    }

    public void deleteNode( int val){
        DeleteNode(root,val);
    }
    private Node DeleteNode(Node root, int val){
        if (root== null){
            System.out.println("Val not exist in BST");
        }
        else if (val < root.data){
            DeleteNode(root.left,val);
        }
        else if (val > root.data){
            DeleteNode(root.right, val);
        }
        else {
//            here to delete
//            case 1 : node with 2 child get min from right of root and replace value then delete that min val node
            if (root.left != null && root.right != null){
                Node min = geetMinNode(root.right);
                root.data = min.data;
                root.right = DeleteNode(root.right,min.data);
            }
            //case 2 node with left child recursive call for left as root
            else if (root.left != null){
                root = root.left;
            }
            //case 3 node with right child recursive call for right as root
            else if (root.right != null){
                root = root.right;
            }
            else {
                return null;
            }
        }
        return root;
    }

    private Node geetMinNode(Node root) {
        if (root.left == null) {
            return root;
        }
        return geetMinNode(root.left);
    }

    public void search(int val){
        search(val,root);
    }
    private void search( int val, Node root){
        if (root == null){
            System.out.println("Not found");
            return;
        }
        if (val == root.data){
            System.out.println(val +" found in bst.");
        }
        if (val > root.data) {
            search(val,root.right);
        }
        else if( val < root.data){
            search(val, root.left);
        }
    }

    public void preOrder(){
        preorder(this.root);
    }

    private void preorder(Node root){
        if (root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        BST o = new BST();
        o.insert(2);
        o.insert(3);
        o.insert(5);
        o.insert(1);
        o.insert(0);
        o.insert(11);
        o.insert(4);
        o.preOrder();
//        o.deleteNode(5);
//        System.out.println("After deletion");
//        o.preOrder();
//        System.out.println();
//        o.search(3);
    }
}
