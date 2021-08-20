public class StringPermutation {

    public static void main(String[] args) {
       String s = "abc";
       permutation(s, "");
    }

    static void permutation(String s, String ans) {

        if(s.equals("")) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);

            String ros = s.substring(0,i) + s.substring(i+1);

            permutation(ros, ans + a);

        }
    }
}
