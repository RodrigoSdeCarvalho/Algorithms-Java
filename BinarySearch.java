// Simply put, the algorithm compares the key value with the middle element of the array; 
// if they are unequal, the half in which the key cannot be part of is eliminated, 
// and the search continues for the remaining half until it succeeds.

// Remember – the key aspect here is that the array is already sorted.

// If the search ends with the remaining half being empty, the key is not in the array.

//The time complexity of the binary search algorithm is O(log n).

public class BinarySearch {
    public static int binarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = low  + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            return binarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }

    public static int binarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int middle = low + ((high - low) / 2);

            if (sortedArray[middle] < key) {
                low = middle + 1;
            } else if (sortedArray[middle] > key) {
                high = middle - 1;
            } else {
                index = middle;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 5; 
        int low = 1; 
        int high = 9;

        int searchResultRecursively = binarySearchRecursively(arr, key, low, high);
        int searchResultIteratively = binarySearchIteratively(arr, key, low, high);

        if (searchResultRecursively == -1 && searchResultIteratively == -1) {
            System.out.println(key + " Not found");
        } else {
            System.out.println(key + " is found at index: " + searchResultRecursively);
            System.out.println(key + " is found at index: " + searchResultIteratively);
        }
    }
}
