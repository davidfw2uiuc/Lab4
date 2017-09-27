/*
 * The following code needs a lot of TLC. So give it some!
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * finds longest substring between two strings.
 */
public class ReclamationProject {

    /**
     * Finds the longest common substring between a and b.
     *
     * @param a 1st input string
     * @param b 2nd input string
     * @return returns longest common substring
     */

    static String findSubstring(final String a, final String b) {
        int aLen = a.length(), bLen = b.length();
        String str1 = a, str2 = b;
        if (aLen > bLen) {
            str1 = b;
            str2 = a;
        }
        String r = "";

        for (int i = 0; i < aLen; i++) {
            for (int j = bLen - i; j > 0; j--) {
                for (int k = 0; k < bLen - j; k++) {
                    if (str1.regionMatches(i, str2, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
