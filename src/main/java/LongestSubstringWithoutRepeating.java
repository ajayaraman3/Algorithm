import java.util.ArrayList;

public class LongestSubstringWithoutRepeating {

    public static void main(String args[]) {

        String s = "bbbbb";
        System.out.print(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;

        int result = 0;

        String modifiedString = "|" + s;

        ArrayList charSet = new ArrayList();

        if(s != null) {
            for (int i = 0; i < modifiedString.length(); i++) {
                if (!charSet.contains(modifiedString.charAt(i))) {
                    charSet.add(modifiedString.charAt(i));
                    length++;
                    if (length > result) {
                        result = length;
                    }
                } else {
                    charSet = new ArrayList();
                    length = 2;
                }
            }
        }

        return result-1;
    }


}
