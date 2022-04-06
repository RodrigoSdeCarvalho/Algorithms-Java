public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,7,9};
        int key = 5;

        int searchResult = linearSearch(arr1, key);

        System.out.println(key+" is found at index: " + searchResult);
    }
}
