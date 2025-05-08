from idata_generator import IDataGenerator
import random

class DataGenerator(IDataGenerator):
    def generate_random_array(self, size):
        return [random.randint(0, size * 10) for _ in range(size)]

    def generate_sorted_array(self, size):
        return list(range(size))

    def generate_nearly_sorted_array(self, size):
        array = self.generate_sorted_array(size)
        elements_to_shuffle = size // 20
        for _ in range(elements_to_shuffle):
            pos1 = random.randint(0, size - 1)
            pos2 = random.randint(0, size - 1)
            array[pos1], array[pos2] = array[pos2], array[pos1]
        return array

    def generate_reverse_array(self, size):
        return list(range(size, 0, -1))