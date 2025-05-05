from abc import ABC, abstractmethod

class BaseAlgorithm(ABC):
    def __init__(self):
        self.name = None
        self.minimal_complexity = None
        self.average_complexity = None
        self.maximal_complexity = None

    def get_name(self):
        return self.name

    def get_minimal_complexity(self):
        return self.minimal_complexity

    def get_average_complexity(self):
        return self.average_complexity

    def get_maximal_complexity(self):
        return self.maximal_complexity

    @abstractmethod
    def get_elemental_operations(self, n):
        pass