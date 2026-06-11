class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        String ans="";
        int l=0;
        while(l<a.length() && l<b.length() && a.charAt(l)==b.charAt(l)){
            ans+=a.charAt(l);
            l++;
        }
        return ans;
    }
}