class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count=new int[26];
        int left=0;
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int right=0;right<s2.length();right++){
            count[s2.charAt(right)-'a']--;
            while(right-left+1>s1.length()){
                count[s2.charAt(left)-'a']++;
                left++;
            }
            if(right-left+1==s1.length()){
                if(mismatch(count)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean mismatch(int[] count){
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
