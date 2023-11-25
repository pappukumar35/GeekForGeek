public class Check_if_strings_arerotations_ofeach_otheror_not {

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 += s1;
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "abcde";
        String s2 = "deabc";

        if (areRotations(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }
}
