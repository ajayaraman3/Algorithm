public class FibonacciSeriesRecursion {

    public static void main(String[] args) {
        int input = 10;
        for (int i = 0; i < input; i++) {

            System.out.println(fibonacci(i));
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            return (fibonacci(n - 2) + fibonacci(n - 1));
        }


    }

}
