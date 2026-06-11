class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=0;
        int count=0;
        if(s.length()==1){
            return 1;
        }
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                count=Math.max(right-left+1,count);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
