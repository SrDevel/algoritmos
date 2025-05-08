from data_generator import DataGenerator
from profiler import Profiler
from sequential_search import SequentialSearch
from binary_search import BinarySearch
from bubble_sort import BubbleSort
from insertion_sort import InsertionSort
from selection_sort import SelectionSort

def test_search(profiler, algorithm, array, element):
    time = profiler.profile_search_time(algorithm, array, element)
    print(f"{algorithm.get_name()}: {time} nanosegundos")

def test_sort(profiler, algorithm, array):
    time = profiler.profile_sort_time(algorithm, array)
    print(f"{algorithm.get_name()}: {time} nanosegundos")
    memory_used = profiler.profile_memory_used()
    print(f"Memoria usada por {algorithm.get_name()}: {memory_used} bytes")

def main():
    data_generator = DataGenerator()
    profiler = Profiler()

    sequential_search = SequentialSearch()
    binary_search = BinarySearch()

    bubble_sort = BubbleSort()
    insertion_sort = InsertionSort()
    selection_sort = SelectionSort()

    sizes = [100, 1000, 10000]

    print("=== PRUEBAS DE ALGORITMOS ===")

    for size in sizes:
        print(f"\n--- Prueba con array de tamaño {size} ---")

        random_array = data_generator.generate_random_array(size)
        sorted_array = data_generator.generate_sorted_array(size)
        nearly_sorted_array = data_generator.generate_nearly_sorted_array(size)
        reverse_array = data_generator.generate_reverse_array(size)

        element_to_search = size - 1

        print("\nAlgoritmos de búsqueda:")
        test_search(profiler, sequential_search, sorted_array, element_to_search)
        test_search(profiler, binary_search, sorted_array, element_to_search)

        print("\nAlgoritmos de ordenación con array aleatorio:")
        test_sort(profiler, bubble_sort, random_array[:])
        test_sort(profiler, insertion_sort, random_array[:])
        test_sort(profiler, selection_sort, random_array[:])

        print("\nAlgoritmos de ordenación con array casi ordenado:")
        test_sort(profiler, bubble_sort, nearly_sorted_array[:])
        test_sort(profiler, insertion_sort, nearly_sorted_array[:])
        test_sort(profiler, selection_sort, nearly_sorted_array[:])

        print("\nAlgoritmos de ordenación con array inverso:")
        test_sort(profiler, bubble_sort, reverse_array[:])
        test_sort(profiler, insertion_sort, reverse_array[:])
        test_sort(profiler, selection_sort, reverse_array[:])

        memory_used = profiler.profile_memory_used()
        print(f"\nMemoria utilizada: {memory_used} bytes")

if __name__ == "__main__":
    main()