class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int j=0;j<nums.length-3;j++){
            if(j>0 && nums[j]==nums[j-1]){
                continue;
            }
            for(int i=j+1;i<nums.length-2;i++){
                if(i>j+1 && nums[i]==nums[i-1]){
                    continue;
                }
                int left=i+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        right--;
                        left++;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
