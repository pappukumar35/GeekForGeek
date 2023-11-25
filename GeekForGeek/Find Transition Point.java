class Solution {

    int transitionPoint(int arr[], int n) {

        // code here

        if (arr[0] == 1) {

            return 0;

        }

        int low = 0;

        int high = n - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] == 0 && arr[mid + 1] == 1) {

                return mid + 1;

            }

            if (arr[mid] == 1 && arr[mid - 1] == 0) {

                return mid;

            }

            if (arr[mid] == 0) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return -1;

    }

}