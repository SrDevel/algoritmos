from abc import ABC, abstractmethod

class IProfiler(ABC):
    @abstractmethod
    def profile_search_time(self, algorithm, array, element):
        pass

    @abstractmethod
    def profile_sort_time(self, algorithm, array):
        pass

    @abstractmethod
    def profile_memory_used(self):
        pass