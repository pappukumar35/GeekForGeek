class Solution {
    static int isPossible(int N, int arr[]) {
        
        int sum=0;
        
        for(int i:arr){
            while(i>0){
                int rem=i%10;
                i/=10;
                sum+=rem;
            }
        }
        return sum%3==0?1:0;
    }
}
 