package SearchAlgorithms;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int length, int key) {
        if (arr[0] == key) {
            return 0;
        }

        int i = 1;
        while (i < length && arr[i] <= key) {
            i *= 2;
        }

        return BinarySearch.binarySearchIteratively(arr, key, i/2, Math.min(i, length - 1));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;

        int index = exponentialSearch(arr, arr.length, key);

        System.out.println("Number found at index: " + index);
    }
}
