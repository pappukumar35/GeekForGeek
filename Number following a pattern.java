public class Number
following a pattern
{

    static String printMinNumberForPattern(String S) {
        // code here
        String ans = "";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i < S.length(); i++) {
            st.push(num);
            num++;
            if (S.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    ans += Integer.toString(st.pop());
                }
            }
        }
        st.push(num);
        while (!st.isEmpty()) {
            ans += Integer.toString(st.pop());
        }
        return ans;
    }
}
