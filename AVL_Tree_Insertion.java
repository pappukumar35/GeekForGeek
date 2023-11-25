import org.w3c.dom.Node;

public class AVL_Tree_Insertion {
    
    public Node insertToAVL(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (node.data > data) {
            node.left = insertToAVL(node.left, data);
        } else if (node.data < data) {
            node.right = insertToAVL(node.right, data);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int diff = height(node.left) - height(node.right);
        if (diff > 1) { // Left subtree is higher
            if (data < node.left.data) {
                return rightRotate(node);
            } else if (data > node.left.data) { // LR rotation
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } else if (diff < -1) { // Right subtree is higher
            if (data < node.right.data) { // RL rotation
                node.right = rightRotate(node.right);
                return leftRotate(node);
            } else if (data > node.right.data) {
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node leftRotate(Node a) {
        Node b = a.right;
        Node t2 = b.left;
        b.left = a;
        a.right = t2;
        a.height = Math.max(height(a.left), height(a.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;
        return b;
    }

    public Node rightRotate(Node a) {
        Node b = a.left;
        Node t2 = b.right;
        b.right = a;
        a.left = t2;
        a.height = Math.max(height(a.left), height(a.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;
        return b;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.height;
        }
    }
}
}
