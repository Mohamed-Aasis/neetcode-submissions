class Solution {
    public int removeElement(int[] nums, int val) {
        int m=0;
        for(int i:nums){
            if(i==val){
                continue;
            }
            nums[m]=i;
            m++;
        }
        return m;
    }
}