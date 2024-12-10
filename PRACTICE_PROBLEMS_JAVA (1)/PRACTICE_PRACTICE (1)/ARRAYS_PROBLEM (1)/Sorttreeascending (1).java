package JAVAFULL.ARRAYS_PROBLEM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
public class Sorttreeascending {
    BinaryNode root;
    int size;
    public Sorttreeascending() {
        this.root = null;
    }
    void insertNode(int value) {
        BinaryNode node = new BinaryNode(value);
        if (root == null) {
            root = node;
            size++;
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            } else {
                currentNode.left = node;
                size++;
                return;
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            } else {
                currentNode.right = node;
                size++;
                return;
            }
        }
    }
    // Delete a node
    void delete(int deleteValue) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode nodeToDelete;
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.value == deleteValue) {
                nodeToDelete = currentNode;
                BinaryNode depestNode = getDepestNode();
                nodeToDelete.value = depestNode.value;
                deleteDepestNode(depestNode);
                break;
            }
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    // get depest node
    private BinaryNode getDepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode depestNode = null;
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
            depestNode = currentNode;
        }
        return depestNode;
    }

    // Delete deepest node
    private void deleteDepestNode(BinaryNode depestNode) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            try {
                if (currentNode.left == depestNode) {
                    currentNode.left = null;
                } else if (currentNode.right == depestNode) {
                    currentNode.right = null;
                } else {
                    if (currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
                }
            } catch (NullPointerException ignored) {
            }
        }
    }

    // Delete entire tree
    void deleteTree() {
        root = null;
    }

    // Print Pre Order (ROOT _ LEFT _ RIGHT)
    void printPreOrder() {
        this.printPreOrder(this.root);
    }

    private void printPreOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    // Print In Order (LEFT _ ROOT _ RIGHT)
    void printInOrder() {
        this.printInOrder(this.root);
    }

    private void printInOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    // print Post Order (LEFT _ RIGHT _ ROOT)
    void printPostOrder() {
        this.printPostOrder(this.root);
    }
    private void printPostOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Print Level Order (level 1 all, then 2 all and so on)
    void printLevelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    // Search in Binary tree
    void searchNode(int searchValue) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.value == searchValue) {
                System.out.println("The value is found in Tree!");
                return;
            }
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        System.out.println("The value is NOT there in tree!");
    }
    void sortTreeAscending(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arr = new ArrayList<>();
        while (!(queue.isEmpty())) {
            BinaryNode currentNode = queue.remove();
            arr.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        Collections.sort(arr);
        deleteTree();
        for(Integer i: arr){
            insertNode(i);
        }
    }
    // <--------- Node Class ----------->
    class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;
        public BinaryNode(int value) {
            this.value = value;
        }
    }
    public static void main(String args[]){
        Sorttreeascending bt=new Sorttreeascending();
        bt.insertNode(100);
        bt.insertNode(90);
        bt.insertNode(80);
        bt.insertNode(70);
        bt.insertNode(60);
        bt.insertNode(50);
        bt.insertNode(40);
        bt.insertNode(30);
        System.out.println("inorder");
        bt.printInOrder();
        bt.sortTreeAscending();
        System.out.println(bt.size);
        System.out.println("level");
        bt.printLevelOrder();
    }
}