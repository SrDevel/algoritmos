package sorting;

import base.BaseAlgorithm;
import interfaces.ISortingAlgorithm;

public class SelectionSort extends BaseAlgorithm implements ISortingAlgorithm {

    public SelectionSort(){
        this.name = "Ordenamiento por Selección";
        this.minimalComplexity = "O(n^2)";
        this.averageComplexity = "O(n^2)";
        this.maximalCompleity = "O(n^2)";
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++){
            int minIdex = i;

            for (int j = i; j < n; j++) {
                if (array[j] < array[minIdex]) minIdex = j;
            }
            if (minIdex != i) {
                int temp = array[i];
                array[i] = array[minIdex];
                array[minIdex] = temp;
            }
        }
    }

    @Override
    public Long getElementalOperations(int n) {
        return (long) n * n / 2;
    }
}
