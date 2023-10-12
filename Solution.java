import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

class Solution {
    public static void main(String[] args) {

    private Set<String> subtreeHashes = new HashSet<>();
    private boolean duplicateSubtreeFound = false;

    String func(Node root) {
        if (root == null)
            return "";

        String l = func(root.left);
        String r = func(root.right);

        String s = Integer.toString(root.data) + l + r;

        if (subtreeHashes.contains(s) && s.length() > 2) {
            duplicateSubtreeFound = true;
        }

        subtreeHashes.add(s);
        return s;
    }

    int dupSub(Node root) {
        // code here

        func(root);
        return duplicateSubtreeFound ? 1 : 0;
    }
}
