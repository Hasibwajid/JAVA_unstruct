/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA_STRUCTURE_AND_ALGO.TREES;

class NodeH {

    NodeH left, right;
    int data, height;

    NodeH(int d) {
        data = d;
        height = 1;
    }
}

public class AVLTree {

    NodeH root;

    int height(NodeH n) {
        if (n == null) {
            return 0;
        }
        return n.height;
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }

    NodeH rightRotate(NodeH n) {
        NodeH x = n.left;
        NodeH t2 = x.right;
        x.right = n;
        n.left = t2;
        x.height = max(height(x.left), height(x.right)) + 1;
        n.height = max(height(n.left), height(n.right)) + 1;
        return x;
    }

    NodeH leftRotate(NodeH n) {
        NodeH x = n.right;
        NodeH t2 = x.left;
        x.left = n;
        n.right = t2;
        x.height = max(height(x.left), height(x.right)) + 1;
        n.height = max(height(n.left), height(n.right)) + 1;
        return x;
    }

    int getBalancingFactor(NodeH N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }
    
    NodeH insertNode(int item) {
        return insertNode(root,item);
    }

    NodeH insertNode(NodeH node, int item) {
        if (node == null) {
            return (new NodeH(item));
        }
        if (item > node.data) {
            node.right = insertNode(node.right, item);
        }
        else if (item < node.data) {
            node.left = insertNode(node.left, item);
        }
        else {
            return node;
        }
        node.height = 1 + max(height(node.left), height(node.right));
        int bf = getBalancingFactor(node);
        if (bf > 1) {
            if (item < node.left.data) {
                return rightRotate(node);
            } else if (item > node.left.data) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (bf < -1) {
            if (item > node.right.data) {
                return leftRotate(node);
            } else if (item < node.right.data) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
        //ullu k pathay

    }
    void printTree() {
     printTree(root, "  ", true) ;
    }

    void printTree(NodeH curPtr, String indent, boolean last) {
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

    NodeH deleteNode(int item){
        return deleteNode(root,item);
    }
    
    NodeH deleteNode(NodeH root, int item) {
        if (root == null) {
            return root;
        }
        if (item < root.data) {
            root.left = deleteNode(root.left, item);
        } else if (item > root.data) {
            root.right = deleteNode(root.right, item);
        } else if ((root.left == null) || (root.right == null)) {
            NodeH temp = null;
            if (temp == root.left) {
                temp = root.right;
            } else {
                temp = root.left;
            }
            if (temp == null) {
                temp = root;
                root = null;
            } else {
                root = temp;
            }
        } else {
            NodeH temp = nodeWithMinimumValue(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }

        if (root == null) {
            return root;
        }
        root.height = max(height(root.left), height(root.right)) + 1;
        int bf = getBalancingFactor(root);
        if (bf > 1) {
         if( getBalancingFactor(root.left) >= 0){
             return rightRotate(root);
         } else {
             root.left = leftRotate(root.left);
             return rightRotate(root);
         }
        }
        if( bf < -1){
            if( getBalancingFactor(root.left) <= 0){
             return leftRotate(root);
         } else {
             root.right = rightRotate(root.right);
             return leftRotate(root);
         }
        }
        return root;
    }

    NodeH nodeWithMinimumValue(NodeH node) {
        if (node.left != null) {
           return nodeWithMinimumValue(node.left);
        } else {
            return node;
        }
    }

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.root = avl.insertNode(30);
        avl.root = avl.insertNode(13);
        avl.root = avl.insertNode(53);
        avl.root = avl.insertNode(9);
        avl.root = avl.insertNode(21);
        avl.root = avl.insertNode(61);
        avl.root = avl.insertNode(8);
        avl.root = avl.insertNode(11);
        avl.root = avl.insertNode(82);
        System.out.println("Original Tree:");
        System.out.println("------------------------------");
        avl.printTree();
        avl.deleteNode(30);
        System.out.println("After deletion:");
        System.out.println("------------------------------");
        avl.printTree();

    }

}
