class Solution {
    public String mergeAlternately(String word1, String word2) {
        String neww="";
        int left=0;
        int right=0;
        while(left<word1.length() && right<word2.length()){
            neww+=word1.charAt(left);
            neww+=word2.charAt(right);
            left++;
            right++;
        }
        while(left<word1.length()){
            neww+=word1.charAt(left);
            left++;
        }
        while(right<word2.length()){
            neww+=word2.charAt(right);
            right++;
        }
        return neww;
    }
}