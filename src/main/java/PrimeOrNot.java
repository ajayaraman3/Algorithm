public class PrimeOrNot {
    public static void main(String[] args) {
        boolean isPrime = true;
        int input = 11;

        if (input > 3) {
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime);

    }
}
