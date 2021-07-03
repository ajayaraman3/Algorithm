public class BinarySearch {

    public static void main(String[] args) {

        int[] inputArray = {1,3,5,7,8,9,10};
        int key = 9;
        System.out.println(new BinarySearch().search(inputArray,key));
    }

    private int search(int[] input, int key) {

        int low = 0;
        int high = input.length;
        int mid = (low + high) / 2;

        while( low <= high) {

            if(input[mid] == key)
                return mid;
            else if(key < input[mid]) {
                high = mid -1;
                mid = (low + high) / 2;
            } else {
                low = mid + 1;
                mid = (low + high) / 2;
            }

        }

        return -1;

    }
}
