import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        int[] input = {3,8,4,0,1,2,5,9};

        int[] finalArray = mergeSort(input);

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i]);
        }


    }

    private static int[]  mergeSort(int[] args) {
        if(args.length == 1) {
            return args;
        }

        int mid = (args.length / 2);
        int[] a = Arrays.copyOfRange(args, 0, mid);
        int[] b = Arrays.copyOfRange(args, mid, args.length);
        int[] aSorted = mergeSort(a);
        int[] bSorted = mergeSort(b);
        mergeSort(b);
        int[] merged = merge(aSorted, bSorted);
        return merged;
    }


    private static int[] merge(int[] a, int[] b) {

        List<Integer> sorted = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < a.length) {

            while (j < b.length) {
                if (a[i] < b[j]) {
                    sorted.add(a[i]);
                    i++;
                    break;
                } else if (b[j] < a[i]) {
                    sorted.add(b[j]);
                    j++;
                }
            }

            if (i == a.length) {
                while (j < b.length) {
                    sorted.add(b[j]);
                    j++;
                }
            }

            if (j == b.length && i < a.length) {
                while (i < a.length) {
                    sorted.add(a[i]);
                    i++;
                }
            }
        }
        int[] sortedArray = new int[sorted.size()];
        for (int k = 0; k < sorted.size(); k++) {
            sortedArray[k] = sorted.get(k);
        }
        return sortedArray;
    }


}




