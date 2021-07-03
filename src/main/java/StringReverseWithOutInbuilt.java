public class StringReverseWithOutInbuilt {

    public static void main(String[] args) {
        String s = "ABCDEF";
        char[] chars = s.toCharArray();
        for (int i = chars.length-1 ; i >=0 ; i--) {
            System.out.print(chars[i]);
        }

    }
}
