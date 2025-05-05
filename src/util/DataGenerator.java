package util;

import interfaces.IDataGenerator;

import java.util.Random;

public class DataGenerator implements IDataGenerator {
    private final Random random;

    public DataGenerator() {
        random = new Random();
    }

    @Override
    public int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size * 10);
        }
        return array;
    }

    @Override
    public int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    @Override
    public int[] generateNearlySortedArray(int size) {
        int[] array = generateSortedArray(size);

        int elementsToShuffle = size / 20;
        for (int i = 0; i < elementsToShuffle; i++) {
            int pos1 = random.nextInt(size);
            int pos2 = random.nextInt(size);

            int temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
        }
        return array;
    }

    @Override
    public int[] generateReverseArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i - 1;
        }
        return array;
    }
}