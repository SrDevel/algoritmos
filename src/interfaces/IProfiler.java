package interfaces;

public interface IProfiler {
    long profileSearchTime(ISearchAlgorithm algorithm, int[] array, int element);
    long profileSortTime(ISortingAlgorithm algorithm, int[] array);
    long profileMemoryUsed();
}