public class BST {
    public static void main(String[] args) {
        Node root=null;
        BST tree = new BST();
        root = tree.insert(root,8);
        root = tree.insert(root, 3);
        root = tree.insert(root, 11);
    }
    

    private Node insert(Node node, int val) {
        if(node == null)
        {
            Node tree = new Node(val);

        }
        else if(val<node.data)
        { 
            node.left = insert(node.left,val);
        }
        else if (val > node.data) {
            insert(node.right, val);
        }
        return node;
    }
    
}

class Node {
    int data;
    Node right;
    Node left;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
