public class Move
all zeroes
to end
of array
{
    class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int i=0,j=0;
        while(j<n){
            while(j<n-1&&arr[j]==0){
                j++;
            }
            arr[i]=arr[j];
            i++;j++;
        }
        while(i<n){
            arr[i]=0;
            i++;
        }
    }
}
}
