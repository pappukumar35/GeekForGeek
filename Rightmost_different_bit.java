class Solution
{
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m==n)
        return -1;
        int ans = m^n;
        int c=1;
        int b=1;
        while((ans&b) != b){
            c++;
            ans>>=1;
        }
        return c;
    }
}