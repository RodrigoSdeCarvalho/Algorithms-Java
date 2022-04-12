public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int key) {
        int high = arr.length - 1;
        int low = 0;

        while (key >= arr[low] && key <= arr[high] && low <= high) {
            int pos = low + ((key - arr[low]) * (high - low)) /
                    (arr[high] - arr[low]);

            if (arr[pos] == key) {
                return pos;
            } else if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 8;
        int index = interpolationSearch(arr, key);

        System.out.println("Number found at index: " + index);
    }
}
