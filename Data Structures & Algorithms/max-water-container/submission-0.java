class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxi=0;
        while(left<right){
            maxi=Math.max(maxi,Math.min(heights[left],heights[right])*(right-left));
            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxi;
    }
}
