class Solution {
    int mod = (int) (1e9 + 7);
    int cnt = 0;

    public void count(Node root, int k, ArrayList<Integer> path) {

        if (root == null)
            return;

        path.add(root.data);

        int sum = 0;

        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) {
                cnt++;
            }
        }

        count(root.left, k, path);
        count(root.right, k, path);

        path.remove(path.size() - 1);
    }

    public int sumK(Node root, int k) {

        ArrayList<Integer> path = new ArrayList<>();

        count(root, k, path);

        return cnt % mod;
    }

}

class Solution {
    int mod = (int) (1e9 + 7);
    int cnt = 0;

    public void count(Node root, int k, ArrayList<Integer> path) {

        if (root == null)
            return;

        path.add(root.data);

        int sum = 0;

        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) {
                cnt++;
            }
        }

        count(root.left, k, path);
        count(root.right, k, path);

        path.remove(path.size() - 1);
    }

    public int sumK(Node root, int k) {

        ArrayList<Integer> path = new ArrayList<>();

        count(root, k, path);

        return cnt % mod;
    }

}