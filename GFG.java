class GfG {
    Node buildBalancedTree(Node root) {
        // Add your code here.
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        Node res = BalancedBst(list, 0, list.size() - 1);
        return res;
    }

    void inOrder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    Node BalancedBst(ArrayList<Integer> list, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        Node root = new Node(list.get(mid));
        root.left = BalancedBst(list, l, mid - 1);
        root.right = BalancedBst(list, mid + 1, r);
        return root;
    }
}
