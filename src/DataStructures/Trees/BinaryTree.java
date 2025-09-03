package DataStructures.Trees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    static Node createNode(int val){
        return new Node(val);
    }

    public static void main(String[] args) {

        Node root =  createNode(1); // root level

        root.left = createNode(2); // level 2
        root.right = createNode(3);

        root.left.left = createNode(4); // level 3
        root.left.right = createNode(5);
        root.right.left = createNode(6);
        root.right.right = createNode(7);

        root.left.right.left = createNode(8); // level 4
        root.right.left.left = createNode(15);
        root.right.left.right = createNode(9);

    }
}
