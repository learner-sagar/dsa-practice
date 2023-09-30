public class ValidPalindrome2 {
    public static boolean isPalindrome(String s) {
        // defining left right result and a skip variable to check for one skip
        // condition
        int left = 0;
        int right = s.length() - 1;
        boolean result = true;
        boolean skipedOneValue = false;

        // iterating over the string and checking comparing left and right values
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // this condition checks, if we skipped one character
                if (skipedOneValue) {
                    result = false;
                }
                skipedOneValue = true;

                // incrimenting only from left to skip one character form left
                left++;
                continue;
            }
            left++;
            right--;
        }
        if (result) {
            return true;
        }

        // reassigning values to check from right side
        result = true;
        skipedOneValue = false;
        left = 0;
        right = s.length() - 1;

        // iterating over the string and checking comparing left and right values
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // this condition checks, if we skipped one character
                if (skipedOneValue) {
                    result = false;
                }
                skipedOneValue = true;

                // decrementing only from right to skip one character form right
                right--;
                continue;
            }
            left++;
            right--;
        }

        return result;
    }
}
