public class Isomorphic Strings

{

    //Function to check if two strings are isomorphic.

    public static boolean areIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {

            return false;

        }

        HashMap<Character, Character> h = new HashMap<Character, Character>();

        HashMap<Character, Character> k = new HashMap<Character, Character>();

        for (int i = 0; i < str1.length(); i++) {

            char c = str1.charAt(i);

            char d = str2.charAt(i);

            if (h.containsKey(c)) {

                if (h.get(c) != d) {

                    return false;

                }

            }

            else {

                h.put(c, d);

            }

            if (k.containsKey(d)) {

                if (k.get(d) != c) {

                    return false;

                }

            }

            else {

                k.put(d, c);

            }

        }

        return true;

    }

}}
