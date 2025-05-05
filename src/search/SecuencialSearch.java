package search;

import base.BaseAlgorithm;
import interfaces.ISearchAlgorithm;

public class SecuencialSearch extends BaseAlgorithm implements ISearchAlgorithm {

    public SecuencialSearch(){
        this.name = "Búsqueda secuencial";
        this.minimalComplexity = "O(1)";
        this.averageComplexity = "O(n)";
        this.maximalCompleity = "O(n)";
    }

    @Override
    public void search(int[] array, int value) {
        for (int j : array) {
            if (j == value) return;
        }
    }

    @Override
    public Long getElementalOperations(int n) {
        return n / 2L;
    }
}
