class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxp=0;
        while(left<right && right<prices.length){
            if(prices[left]<prices[right]){
                maxp=Math.max(maxp,prices[right]-prices[left]);
            }
            else{
                left=right;
            }
            right++;
        }
        return maxp;
    }
}
