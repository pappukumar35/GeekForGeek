public class Solution14 {
    
{
    public int is_bleak(int n)
    {
        // Code here
        int num=String.valueOf(Math.log(n)).length() + 1;
        for(int i=n-num;i<n;i++)
        {
            if(i+Integer.bitCount(i)==n)
            {
                return 0;
            }
        }
        return 1;
    }
}
}
