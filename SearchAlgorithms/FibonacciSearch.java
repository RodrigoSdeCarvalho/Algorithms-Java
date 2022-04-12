package SearchAlgorithms;
import java.util.stream.IntStream;

public class FibonacciSearch {
    public static int fibonacciSearch(int[] arr, int key) {

        int fibonacciMinus2 = 0;
        int fibonacciMinus1 = 1;
        int fibonacciNumber = fibonacciMinus2 + fibonacciMinus1;
        int arrayLength = arr.length;

        while (fibonacciNumber < arrayLength) {
            fibonacciMinus2 = fibonacciMinus1;
            fibonacciMinus1 = fibonacciNumber;
            fibonacciNumber = fibonacciMinus2 + fibonacciMinus1;
        }

        int offset = -1;

        while (fibonacciNumber > 1) {
            int i = Math.min(offset+fibonacciMinus2, arrayLength-1);

            if (arr[i] < key) {
                fibonacciNumber = fibonacciMinus1;
                fibonacciMinus1 = fibonacciMinus2;
                fibonacciMinus2 = fibonacciNumber - fibonacciMinus1;
                offset = i;
            }

            else if (arr[i] > key) {
                fibonacciNumber = fibonacciMinus2;
                fibonacciMinus1 = fibonacciMinus1 - fibonacciMinus2;
                fibonacciMinus2 = fibonacciNumber - fibonacciMinus1;
            }

            else return i;
        }

        if (fibonacciMinus1 == 1 && arr[offset+1] == key) {
            return offset+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = IntStream.rangeClosed(1, 100).toArray();
        int key = 8;

        int index = fibonacciSearch(arr, key);

        System.out.println("Number found at index: " + index);
    }
}
