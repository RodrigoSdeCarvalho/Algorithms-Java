/**
 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 *If x matches with an element, return the index.
 *If x doesn’t match with any of elements, return -1.

 *The time complexity of the above algorithm is O(n). 
 */

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

        System.out.println(key + " is found at index: " + searchResult);
    }
}
