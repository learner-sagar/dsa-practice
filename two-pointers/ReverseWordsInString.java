public class ReverseWordsInString {
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder(sentence.trim());
        stringBuilder.reverse();

        int start = 0;
        int end = 0;
        while (end < stringBuilder.length()) {
            if (stringBuilder.charAt(end) == ' ') {
                reverseStringPart(start, end - 1, stringBuilder);
                end++;
                while (end < stringBuilder.length() && stringBuilder.charAt(end) == ' ') {
                    stringBuilder.deleteCharAt(end);
                }
                start = end;
            }
            end++;
        }
        reverseStringPart(start, end - 1, stringBuilder);
        return stringBuilder.toString();
    }

    public static void reverseStringPart(int start, int end, StringBuilder stringBuilder) {
        while (start < end) {
            char temp = stringBuilder.charAt(start);
            stringBuilder.setCharAt(start, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}