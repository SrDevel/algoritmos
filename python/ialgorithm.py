from abc import ABC, abstractmethod

class IAlgorithm(ABC):
    @abstractmethod
    def get_name(self):
        pass

    @abstractmethod
    def get_minimal_complexity(self):
        pass

    @abstractmethod
    def get_average_complexity(self):
        pass

    @abstractmethod
    def get_maximal_complexity(self):
        pass

    @abstractmethod
    def get_elemental_operations(self, n):
        pass