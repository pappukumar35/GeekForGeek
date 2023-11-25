public class Check if
string is
rotated by
two places
{

    public static boolean isRotated(String str1, String str2)

    {

        if (str1.length() != str2.length())
            return false;

        String s = str1 + str1;

        String su = s.substring(2, str1.length() + 2);

        String su1 = s.substring(str1.length() - 2, s.length() - 2);

        if (str2.equals(su) || str2.equals(su1))
            return true;

        return false;

    }
}
