from base_algorithm import BaseAlgorithm
from isorting_algorithm import ISortingAlgorithm

class BubbleSort(BaseAlgorithm, ISortingAlgorithm):
    def __init__(self):
        super().__init__()
        self.name = "Ordenamiento Burbuja"
        self.minimal_complexity = "O(n^2)"
        self.average_complexity = "O(n^2)"
        self.maximal_complexity = "O(n^2)"

    def sort(self, array):
        n = len(array)
        for i in range(n - 1):
            swapped = False
            for j in range(n - i - 1):
                if array[j] > array[j + 1]:
                    array[j], array[j + 1] = array[j + 1], array[j]
                    swapped = True
            if not swapped:
                break

    def get_elemental_operations(self, n):
        return n * n // 2