from base_algorithm import BaseAlgorithm
from isearch_algorithm import ISearchAlgorithm

class SequentialSearch(BaseAlgorithm, ISearchAlgorithm):
    def __init__(self):
        super().__init__()
        self.name = "Búsqueda secuencial"
        self.minimal_complexity = "O(1)"
        self.average_complexity = "O(n)"
        self.maximal_complexity = "O(n)"

    def search(self, array, value):
        for element in array:
            if element == value:
                return

    def get_elemental_operations(self, n):
        return n // 2