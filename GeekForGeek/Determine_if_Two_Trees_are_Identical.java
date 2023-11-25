class Solution {
    // Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2) {
        // Code Here
        if (root1 == null || root2 == null)
            return root1 == root2;
        if (root1.data != root2.data)
            return false;

        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);

    }

}