// Jump Search Algorithm is a relatively new algorithm for searching an element in a sorted array.

// The fundamental idea behind this searching technique is to search fewer number of elements compared to linear search algorithm 
// (which scans every element in the array to check if it matches with the element being searched or not). 
// This can be done by skipping some fixed number of array elements or jumping ahead by fixed number of steps in every iteration.

//The time complexity of the jump search algorithm is O(√n).

public class JumpSearch {
    public static int jumpSearch(int[] arr, int key) {
        int length = arr.length;
        int step = (int) Math.floor(Math.sqrt(length));

        int currentLastIndex = step - 1;

        while (currentLastIndex < length && key > arr[currentLastIndex]) {
            currentLastIndex += step;
        }

        for (int i = currentLastIndex - step + 1; i <= currentLastIndex && i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int key = 12;

        int index = jumpSearch(arr, key);
        System.out.println("Number found at index: " + index);
    }
}
