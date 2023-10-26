public class Solution
{
    public int minOperation(int n)
    {
        //code here.
        if(n<=2) return n;
        int curr=n,count=0;
        while(curr>0){
            if(curr%2==0) curr/=2;
            else curr--;
            count++;
        }
        return count;
    }
} {
    
}
