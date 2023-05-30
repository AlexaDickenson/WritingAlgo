import java.io.*;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int n = 5;
        int[] array1 = {4,1,3,9,7}; // output should be 1,3,4,7,9

        int n2 = 9;
        int[] array2 = {2,1,6,10,4,1,3,9,7}; // output should be 1,1,2,3,4,6,7,9,10

        quickSort(array1, 0, n - 1);
        System.out.println("First array: " + Arrays.toString(array1));

        quickSort(array2, 0, n2 - 1);
        System.out.println("Second array: " +Arrays.toString(array2));
    }


    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the pivot
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
