from collections import defaultdict

class FreqStack:
    def __init__(self):
        # Maps the actual number to its total count. e.g., {5: 3, 7: 2}
        self.freq_map = defaultdict(int)
        
        # Maps a frequency to a Stack of numbers. e.g., {1: [5, 7, 4], 2: [5, 7], 3: [5]}
        self.group_map = defaultdict(list)
        
        # Keeps track of the highest frequency we currently have
        self.max_freq = 0

    def push(self, val: int) -> None:
        # 1. Update the frequency of the number
        self.freq_map[val] += 1
        current_freq = self.freq_map[val]
        
        # 2. Update the max_freq if we reached a new high
        if current_freq > self.max_freq:
            self.max_freq = current_freq
            
        # 3. Add the number to its new frequency "floor" (Stack)
        self.group_map[current_freq].append(val)

    def pop(self) -> int:
        # 1. Find the highest frequency stack and pop the top element
        val = self.group_map[self.max_freq].pop()
        
        # 2. Since we removed it, reduce its overall frequency count
        self.freq_map[val] -= 1
        
        # 3. If the highest frequency stack is now empty, our skyscraper got shorter!
        if not self.group_map[self.max_freq]:
            self.max_freq -= 1
            
        return val

# The testing code for Example 1
# obj = FreqStack()
# obj.push(5)
# obj.push(7)
# ...
# param_2 = obj.pop()