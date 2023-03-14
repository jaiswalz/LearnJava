package JavaLearning.com.java.learn;

import java.util.Arrays;

public class SelectionSort {
    void selectionSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for ( int j = i + 1; j < size; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;

                }
            }
            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {20, 12, 10, 15, 6};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));

    }
    }

