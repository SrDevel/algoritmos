import interfaces.*;
import search.*;
import sorting.*;
import util.*;

public class Main {
    public static void main(String[] args) {
        IDataGenerator dataGenerator = new DataGenerator();
        IProfiler profiler = new Profiler();

        ISearchAlgorithm sequentialSearch = new SecuencialSearch();
        ISearchAlgorithm binarySearch = new binarySearch();

        ISortingAlgorithm bubbleSort = new BubbleSort();
        ISortingAlgorithm insertionSort = new InsertionSort();
        ISortingAlgorithm selectionSort = new SelectionSort();

        int[] sizes = {100, 1000, 10000};

        System.out.println("=== PRUEBAS DE ALGORITMOS ===");

        for (int size : sizes) {
            System.out.println("\n--- Prueba con array de tamaño " + size + " ---");

            int[] randomArray = dataGenerator.generateRandomArray(size);
            int[] sortedArray = dataGenerator.generateSortedArray(size);
            int[] nearlySortedArray = dataGenerator.generateNearlySortedArray(size);
            int[] reverseArray = dataGenerator.generateReverseArray(size);

            // Elemento a buscar (último elemento)
            int elementToSearch = size - 1;

            // Pruebas de búsqueda
            System.out.println("\nAlgoritmos de búsqueda:");
            testSearch(profiler, sequentialSearch, sortedArray, elementToSearch);
            testSearch(profiler, binarySearch, sortedArray, elementToSearch);

            // Pruebas de ordenación
            System.out.println("\nAlgoritmos de ordenación con array aleatorio:");
            testSort(profiler, bubbleSort, randomArray.clone());
            testSort(profiler, insertionSort, randomArray.clone());
            testSort(profiler, selectionSort, randomArray.clone());

            System.out.println("\nAlgoritmos de ordenación con array casi ordenado:");
            testSort(profiler, bubbleSort, nearlySortedArray.clone());
            testSort(profiler, insertionSort, nearlySortedArray.clone());
            testSort(profiler, selectionSort, nearlySortedArray.clone());

            System.out.println("\nAlgoritmos de ordenación con array inverso:");
            testSort(profiler, bubbleSort, reverseArray.clone());
            testSort(profiler, insertionSort, reverseArray.clone());
            testSort(profiler, selectionSort, reverseArray.clone());

            // Medición de memoria después de todas las operaciones
            long memoryUsed = profiler.profileMemoryUsed();
            System.out.println("\nMemoria utilizada: " + memoryUsed + " bytes");
        }
    }

    private static void testSearch(IProfiler profiler, ISearchAlgorithm algorithm, int[] array, int element) {
        long time = profiler.profileSearchTime(algorithm, array, element);
        System.out.printf("%s: %d nanosegundos\n", algorithm.getName(), time);
    }

    private static void testSort(IProfiler profiler, ISortingAlgorithm algorithm, int[] array) {
        long time = profiler.profileSortTime(algorithm, array);
        System.out.printf("%s: %d nanosegundos\n",
                ((Ialgorithm)algorithm).getName(), time);

        // También podemos medir la memoria después de cada ordenación
        long memorySortingUsed = profiler.profileMemoryUsed();
        System.out.printf("Memoria usada por %s: %d bytes\n",
                ((Ialgorithm)algorithm).getName(), memorySortingUsed);
    }
}