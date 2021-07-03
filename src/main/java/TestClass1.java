public class TestClass1 {

    public static void main(String args[]) {

        Integer[] s = {0,1,3};
        for(int i=0; i<3;i++) {
            for (int j=2; j>=0; j--) {
                if(s[i] != s[j]) {
                    System.out.println(s[i] + " " + s[j]);
                }
            }
        }

    }



}
