package util;

import interfaces.IProfiler;
import interfaces.ISearchAlgorithm;
import interfaces.ISortingAlgorithm;

public class Profiler implements IProfiler {
    @Override
    public long profileSearchTime(ISearchAlgorithm algorithm, int[] array, int element) {
        long start = System.nanoTime();
        algorithm.search(array, element);
        long end = System.nanoTime();
        return end - start;
    }

    @Override
    public long profileSortTime(ISortingAlgorithm algorithm, int[] array) {
        long start = System.nanoTime();
        algorithm.sort(array);
        long end = System.nanoTime();
        return end - start;
    }

    @Override
    public long profileMemoryUsed() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
