class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                List<Integer> ans=new ArrayList<>();
                if(nums[left]+nums[right]==-nums[i]){
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    ans.add(nums[i]);
                    answer.add(ans);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
                else if(nums[left]+nums[right]>-nums[i]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return answer;
    }
}
