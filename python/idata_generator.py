from abc import ABC, abstractmethod

class IDataGenerator(ABC):
    @abstractmethod
    def generate_random_array(self, size):
        pass

    @abstractmethod
    def generate_sorted_array(self, size):
        pass

    @abstractmethod
    def generate_nearly_sorted_array(self, size):
        pass

    @abstractmethod
    def generate_reverse_array(self, size):
        pass