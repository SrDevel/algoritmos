from iprofiler import IProfiler

class Profiler(IProfiler):
    def profile_search_time(self, algorithm, array, element):
        import time
        start = time.perf_counter_ns()
        algorithm.search(array, element)
        end = time.perf_counter_ns()
        return end - start

    def profile_sort_time(self, algorithm, array):
        import time
        start = time.perf_counter_ns()
        algorithm.sort(array)
        end = time.perf_counter_ns()
        return end - start

    def profile_memory_used(self):
        import os, psutil
        process = psutil.Process(os.getpid())
        return process.memory_info().rss