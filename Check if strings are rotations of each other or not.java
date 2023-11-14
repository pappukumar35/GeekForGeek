
class Solution {

    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 += s1;
        return s1.contains(s2);
    }

}
