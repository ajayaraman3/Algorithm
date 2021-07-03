import java.util.Arrays;

public class BoundedRatio {

    public static void main(String[] args) {
        int[] a = {100};
        int l = 1;
        int r = 1000;

        System.out.println(new BoundedRatio().boundedRatio(a,l,r));

    }

    boolean[] boundedRatio(int[] a, int l, int r) {
        boolean[] result = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int d = (a[i] / (i+1));
            if(a[i] % (i+1) != 0) {
                result[i] = false;
            } else if(l <= d && r>=d) {
                result[i] = true;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
