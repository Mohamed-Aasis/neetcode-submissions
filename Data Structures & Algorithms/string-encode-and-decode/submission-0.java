class Solution {
    List<String> strarray=new ArrayList<>();
    public String encode(List<String> strs) {
        String words="";
        for(String str:strs){
            int length=str.length();
            String len=Integer.toString(length);
            words+=len+"%"+str;    
        }
        return words;
    }

    public List<String> decode(String str) {
        List<String> decode_ans=new ArrayList<>();
        String index="";
        int i=0;
        while(i<str.length()){
            if(str.charAt(i) != '%'){
                index+=str.charAt(i);
                i++;
            }
            else{
                int index_int=Integer.parseInt(index);
                int startindex=i+1;
                int endindex=startindex+index_int;
                String correct_word=str.substring(startindex,endindex);
                decode_ans.add(correct_word);
                i=endindex;
                index="";
            }
        }
        return decode_ans;
    }
}
