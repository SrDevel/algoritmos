from base_algorithm import BaseAlgorithm
from isorting_algorithm import ISortingAlgorithm

class SelectionSort(BaseAlgorithm, ISortingAlgorithm):
    def __init__(self):
        super().__init__()
        self.name = "Ordenamiento por Selección"
        self.minimal_complexity = "O(n^2)"
        self.average_complexity = "O(n^2)"
        self.maximal_complexity = "O(n^2)"

    def sort(self, array):
        n = len(array)
        for i in range(n - 1):
            min_index = i
            for j in range(i + 1, n):
                if array[j] < array[min_index]:
                    min_index = j
            if min_index != i:
                array[i], array[min_index] = array[min_index], array[i]

    def get_elemental_operations(self, n):
        return n * n // 2