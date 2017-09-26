/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * this class calculates the longest common substring
 * between two given strings.
 * @author rittika2
 */

public class LongestCommonSubstring {

    /**
     * @param str1 string 1
     * @param str2 string 2
     * @return the longest common substring
     */
    public static String doit(final String str1, final String str2) {

        // create copies of str1 and str2, because those parameters are immutable
        String copyStr1 = str1;
        String copyStr2 = str2;

        // determine which string is longer
        if (str1.length() > str2.length()) {
            String temp = str1;
            copyStr1 = str2;
            copyStr2 = temp;
        }

        String r = "";

        /*
         * loop through str1 and find the common substrings between
         * str1 and str2
         */
        for (int i = 0; i < copyStr1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if (str1.regionMatches(i, str2, k, j) && j > r.length()) {
                        r = str1.substring(i, i + j);
                    }
                }
            }
        }

        // return the longest common substring between str1 and str2
        // if there is no common substring, return ""
        return r;
    }

}
