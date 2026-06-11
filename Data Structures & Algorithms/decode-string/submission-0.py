class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        curr_str = ""
        curr_num = 0
        
        # Look how clean this is: no 'i += 1' or 'i -= 1' anywhere!
        for char in s:
            if char.isdigit():
                # Build the double-digit numbers (like '12')
                curr_num = curr_num * 10 + int(char)
                
            elif char == '[':
                # SAVE STATE: Push our current progress to the stack
                stack.append((curr_str, curr_num))
                # RESET: Clear the current variables to start the new bracket
                curr_str = ""
                curr_num = 0
                
            elif char == ']':
                # LOAD STATE: Pop the last saved progress
                prev_str, prev_num = stack.pop()
                # COMBINE: Old String + (Number * New String)
                curr_str = prev_str + (prev_num * curr_str)
                
            else:
                # It's a letter! Just add it to our current word.
                curr_str += char
                
        return curr_str