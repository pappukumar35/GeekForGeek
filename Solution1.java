class Solution1 {
    public static int floor(Node root, int x) {
        // Code here
        int a, b;
        if (root == null) {
            return -1;
        } else {
            if (root.data == x)
                return x;
            else if (root.data > x)
                return floor(root.left, x);
            else {
                a = root.data;
                b = floor(root.right, x);
                return a > b ? a : b;
            }
        }
    }
}