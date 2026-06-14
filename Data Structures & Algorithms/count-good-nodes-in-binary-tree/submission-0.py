class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        def dfs(curr, max_so_far):
            if not curr:
                return 0
                
            my_score = 1 if curr.val >= max_so_far else 0
            new_max = max(max_so_far, curr.val)
            
            
            left_score = dfs(curr.left, new_max)
            right_score = dfs(curr.right, new_max)
            
         
            return my_score + left_score + right_score

        return dfs(root, root.val)