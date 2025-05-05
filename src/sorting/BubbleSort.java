package sorting;

import base.BaseAlgorithm;
import interfaces.ISortingAlgorithm;

public class BubbleSort extends BaseAlgorithm implements ISortingAlgorithm {

    public BubbleSort(){
        this.name = "Ordenamiento Burbuja";
        this.minimalComplexity = "O(n^2)";
        this.averageComplexity = "O(n^2)";
        this.maximalCompleity = "O(n^2)";

    }

    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n -1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

    }

    @Override
    public Long getElementalOperations(int n) {
        return (long) n * n / 2;
    }
}
