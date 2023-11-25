import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class Symmetric_Tree {

    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        List<Integer> ll = preorder(root.left, new ArrayList<>());
        List<Integer> lr = postorder(root.right, new ArrayList<>());
        return ll.equals(lr);
    }

    private static List<Integer> preorder(Node root, List<Integer> l1) {
        if (root == null) {
            return null;
        }
        l1.add(root.data);
        preorder(root.left, l1);
        preorder(root.right, l1);
        return l1;
    }

    private static List<Integer> postorder(Node root, List<Integer> l2) {
        if (root == null) {
            return null;
        }
        l2.add(root.data);
        postorder(root.right, l2);
        postorder(root.left, l2);
        return l2;
    }
}
