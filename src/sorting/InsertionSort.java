package sorting;

import base.BaseAlgorithm;
import interfaces.ISortingAlgorithm;

public class InsertionSort extends BaseAlgorithm implements ISortingAlgorithm {

    public InsertionSort() {
        this.name = "Ordenación por Inserción";
        this.minimalComplexity = "O(n)";
        this.averageComplexity = "O(n²)";
        this.maximalCompleity = "O(n²)";
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    @Override
    public Long getElementalOperations(int n) {
        return (long) n * n / 4;
    }
}
