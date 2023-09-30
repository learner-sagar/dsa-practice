class ValidPalindrome1 {
    public static boolean isPalindrome(String s) {
        // Replace this placeholder return statement with your code
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}