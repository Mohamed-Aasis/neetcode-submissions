class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxLeft=0;
        int maxRight=0;
        int sum=0;
        while(left<right){
            if(height[left] < height[right]){
                maxLeft=Math.max(maxLeft,height[left]);
                sum+=maxLeft-height[left];
                left++;
            }
            else{
                maxRight=Math.max(maxRight,height[right]);
                sum+=maxRight-height[right];
                right--;
            }
        }
        return sum;
    }
}
