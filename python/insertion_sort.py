from base_algorithm import BaseAlgorithm
from isorting_algorithm import ISortingAlgorithm

class InsertionSort(BaseAlgorithm, ISortingAlgorithm):
    def __init__(self):
        super().__init__()
        self.name = "Ordenación por Inserción"
        self.minimal_complexity = "O(n)"
        self.average_complexity = "O(n^2)"
        self.maximal_complexity = "O(n^2)"

    def sort(self, array):
        n = len(array)
        for i in range(1, n):
            key = array[i]
            j = i - 1
            while j >= 0 and array[j] > key:
                array[j + 1] = array[j]
                j -= 1
            array[j + 1] = key

    def get_elemental_operations(self, n):
        return n * n // 4