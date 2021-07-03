public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(new SumOfDigit().digitsManipulations(12345628));
    }

    int digitsManipulations(int n) {
        System.out.println('0');
        String temp = Integer.toString(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < temp.length(); i++)
        {
            sum+= (int)temp.charAt(i) - '0';
            product*= (int)temp.charAt(i) - '0';
        }
        int difference = product - sum;
        return difference;
    }
}
