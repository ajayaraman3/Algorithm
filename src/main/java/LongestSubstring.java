public class LongestSubstring {

    public static void main(String args[]) {

        String s = "abbsffffrdasssb";
        System.out.print(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = 1;

        int result = 1;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                length++;
                if (length > result) {
                    result = length;
                }
            } else {
                length = 1;
            }
        }

        return result;
    }


}
