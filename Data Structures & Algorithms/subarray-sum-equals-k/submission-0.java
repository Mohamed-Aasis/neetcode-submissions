class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            int needed=currSum-k;
            if(map.containsKey(needed)){
                count+=map.get(needed);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}