from base_algorithm import BaseAlgorithm
from isearch_algorithm import ISearchAlgorithm

class BinarySearch(BaseAlgorithm, ISearchAlgorithm):
    def __init__(self):
        super().__init__()
        self.name = "Búsqueda binaria"
        self.minimal_complexity = "O(1)"
        self.average_complexity = "O(log n)"
        self.maximal_complexity = "O(log n)"

    def search(self, array, value):
        start = 0
        end = len(array) - 1

        while start <= end:
            mid = start + (end - start) // 2

            if array[mid] == value:
                return

            if array[mid] < value:
                start = mid + 1
            else:
                end = mid - 1

    def get_elemental_operations(self, n):
        import math
        return int(math.log2(n))