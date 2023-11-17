class Binary_Tree_to_CDLL {
    // Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root) {
        // your code here
        Stack<Node> st = new Stack<>();
        addToStack(root, st);
        Node head, cur;
        Node temp = st.pop();
        addToStack(temp.right, st);
        head = temp;
        cur = head;
        while (!st.isEmpty()) {
            // System.out.println(st);
            temp = st.pop();
            addToStack(temp.right, st);
            cur.right = temp;
            temp.left = cur;
            cur = cur.right;

        }
        cur.right = head;
        head.left = cur;
        return head;

    }

    static void addToStack(Node root, Stack<Node> st) {
        if (root == null)
            return;
        st.add(root);
        while (root.left != null) {
            st.add(root.left);
            root = root.left;
        }
    }
}