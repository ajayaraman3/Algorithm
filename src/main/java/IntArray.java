public class IntArray {

    public static void main(String[] args) {
        System.out.println(new IntArray().addTwoDigits(99));
    }

    int addTwoDigits(int n) {

        String temp = Integer.toString(n);
        int[] sumArray = new int[temp.length()];
        int sum = 0;
        for (int i = 0; i < temp.length(); i++)
        {
            sum+= (int)temp.charAt(i) - '0';
        }
        return sum;
    }
}

