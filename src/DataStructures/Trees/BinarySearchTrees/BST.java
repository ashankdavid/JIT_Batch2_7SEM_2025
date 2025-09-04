package DataStructures.Trees.BinarySearchTrees;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;

    BST(){
        root = null;
    }

    private Node insertRec(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.key){
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }return root;
    }

    void insertKey(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node root, int key){
        if(root==null){
            return false;
        }
        if(key==root.key){
            return true;
        } else if (key<root.key) {
            return searchRec(root.left, key);
        }else{
            return searchRec(root.right, key);
        }
    }

    boolean searchKey(int key){
        return searchRec(root, key);
    }

    private Node findSuccessor(Node node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }

    private Node removeRec(Node root, int key){
        if(root==null){
            return root;
        }
        if(key<root.key){
            root.left = removeRec(root.left, key);
        }else if(key > root.key){
            root.right = removeRec(root.right, key);
        }else{
            // Node found to be deleted!
            // case 1- Node with 0 or 1 child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            // case 2 - node with 2 children
            Node successor = findSuccessor(root.right);
            root.key = successor.key;
            root.right = removeRec(root.right, successor.key);
        }
        return root;
    }

    void removeKey(int key){
        root = removeRec(root, key);
    }

    void Indfs(Node root){
        if(root==null) return;
        Indfs(root.left);
        System.out.print(root.key + " ");
        Indfs(root.right);
    }
}

class DriverCode{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insertKey(100);
        bst.insertKey(50);
        bst.insertKey(30);
        bst.insertKey(60);
        bst.insertKey(55);
        bst.insertKey(150);
        bst.insertKey(130);
        bst.insertKey(120);
        bst.insertKey(140);
        bst.insertKey(190);
        bst.Indfs(bst.root);
        int key = 40;
        System.out.println(bst.searchKey(key));

    }
}
