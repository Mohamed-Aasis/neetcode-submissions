class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0||s.length()<t.length()){
            return "";
        }
        int[] windowCount=new int[128];
        int[] targetCount=new int[128];
        int left=0;
        int minLeft=0;
        int minLen=Integer.MAX_VALUE;
        int need=0;
        int have=0;
        for(int right=0;right<t.length();right++){
            if(targetCount[t.charAt(right)]==0){
                need++;
            }
           targetCount[t.charAt(right)]++; 
        }
        for(int right=0;right<s.length();right++){
            windowCount[s.charAt(right)]++;
            if(targetCount[s.charAt(right)]>0 && targetCount[s.charAt(right)]==windowCount[s.charAt(right)]){
                have++;
            }
            while(have==need){
                if(minLen>right-left+1){
                    minLeft=left;
                    minLen=right-left+1;
                }
                windowCount[s.charAt(left)]--;
                if(targetCount[s.charAt(left)]>0 && targetCount[s.charAt(left)]>windowCount[s.charAt(left)]){
                    have--;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(minLeft,minLeft+minLen);
    }
}
