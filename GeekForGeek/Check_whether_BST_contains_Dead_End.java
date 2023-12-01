import org.w3c.dom.Node;

public class Check_whether_BST_contains_Dead_End {
    public static boolean isDeadEnd(Node root) {
        return isDeadEndHelper(root, 1, Integer.MAX_VALUE);
    }

    private static boolean isDeadEndHelper(Node node, int min, int max) {
        if (node == null)
            return false;
        if (min == max)
            return true;
        boolean leftDeadEnd = isDeadEndHelper(node.left, min, node.data - 1);
        boolean rightDeadEnd = isDeadEndHelper(node.right, node.data + 1, max);
        return leftDeadEnd || rightDeadEnd;
    }
}
