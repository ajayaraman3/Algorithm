public class Palindrome {

    public static void main(String[] args) {
        String s = "12344324";
        char[] strArray = s.toCharArray();
        boolean palindrome = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(strArray[i] != strArray[s.length()-(i+1)]) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
