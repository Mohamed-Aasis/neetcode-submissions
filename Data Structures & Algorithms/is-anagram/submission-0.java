class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] characters=new int[26];
        char[] s_char=s.toCharArray();
        char[] t_char=t.toCharArray();
        for(char ch:s_char){
            characters[ch - 'a']++;
        }
        for(char chs:t_char){
            characters[chs - 'a']--;
        }
        for(int i:characters){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}