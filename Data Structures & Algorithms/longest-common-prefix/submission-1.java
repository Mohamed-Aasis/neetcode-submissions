class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        String ans="";
        char[] array1=a.toCharArray();
        char[] array2=b.toCharArray();
        int l=0;
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(strs[0]);
        while(l<array1.length && l<array2.length && array1[l]==array2[l]){
            ans+=array2[l];
            l++;
        }
        return ans;
    }
}