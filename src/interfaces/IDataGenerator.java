package interfaces;

public interface IDataGenerator {
    int[] generateRandomArray(int size);
    int[] generateSortedArray(int size);
    int[] generateNearlySortedArray(int size);
    int[] generateReverseArray(int size);
}