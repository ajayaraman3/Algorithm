public class Pyramid {
    public static void main(String[] args) {

        int rows = 3;
        for (int i = 1; i <= 3; i++) {
            printRow(" ",rows-i);
            printRow(i + " ",i);
            System.out.println("");
        }

    }

    private static void printRow(String s, int i) {

        for (int j = 0; j < i; j++) {
            System.out.print(s);
        }

    }
}
