class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
       if(n%k!=0) return 0;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i+=k){
            set.add(s.substring(i,i+k));
        }
        return set.size()<=2?1:0;
    }
}