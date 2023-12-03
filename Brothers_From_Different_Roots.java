public class Brothers_From_Different_Roots {
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static int find(ArrayList<Integer> l1, ArrayList<Integer> l2, int x) {
        int count = 0;
        int i = 0;
        int j = l2.size() - 1;
        while (i < l1.size() && j >= 0) {
            if (l1.get(i) + l2.get(j) == x) {
                count++;
                i++;
                j--;
            } else if (l1.get(i) + l2.get(j) > x)
                j--;
            else
                i++;
        }
        return count;
    }

    public static int countPairs(Node root1, Node root2, int x) {
        // Code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        int res = find(list1, list2, x);
        return res;

    }
}
