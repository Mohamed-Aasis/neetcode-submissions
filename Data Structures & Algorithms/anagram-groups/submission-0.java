class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String str:strs){
            char[] a=str.toCharArray();
            Arrays.sort(a);
            String word="";
            for(char ch:a){
                word+=ch;
            }
            if(map.containsKey(word)){
                map.get(word).add(str);
            }
            else{
                map.put(word,new ArrayList<String>());
                map.get(word).add(str);
            }
        }
        for(List<String> ams:map.values()){
            ans.add(ams);
        }
        return ans;
    }
}
