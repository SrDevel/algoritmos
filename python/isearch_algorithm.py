from abc import ABC, abstractmethod
from ialgorithm import IAlgorithm

class ISearchAlgorithm(IAlgorithm):
    @abstractmethod
    def search(self, array, value):
        pass