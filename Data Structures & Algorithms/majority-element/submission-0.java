class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=0;
        for(int num:nums){
            if(candidate==num){
                count++;
                if(count>nums.length/2){
                    return candidate;
                }
            }
            else{
                count--;
                if(count<0){
                    candidate=num;
                    count=0;
                }
            }
        }
        return candidate;
    }
}