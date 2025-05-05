package search;

import base.BaseAlgorithm;
import interfaces.ISearchAlgorithm;

public class binarySearch extends BaseAlgorithm implements ISearchAlgorithm {

    public binarySearch() {
        this.name = "Búsqueda binaria";
        this.minimalComplexity = "O(1)";
        this.averageComplexity = "O(log n)";
        this.maximalCompleity = "O(log n)";
    }

    @Override
    public void search(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == value) return;

            if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
    }

    @Override
    public Long getElementalOperations(int n) {
        return (long) (Math.log(n) / Math.log(2));
    }
}