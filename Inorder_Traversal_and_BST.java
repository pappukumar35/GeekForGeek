public class Inorder_Traversal_and_BST {
    static int isRepresentingBST(int arr[], int N) {
        // code here
        if (N == 1 || N == 0) {
            return 1;
        }
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }
        if (arr[N - 2] > arr[N - 1]) {
            return 0;
        }
        return 1;
    }
}
