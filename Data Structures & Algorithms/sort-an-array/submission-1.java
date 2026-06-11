class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int mid=nums.length/2;
        int[] lefthalf=Arrays.copyOfRange(nums,0,mid);
        int[] righthalf=Arrays.copyOfRange(nums,mid,nums.length);

        int[] left=sortArray(lefthalf);
        int[] right=sortArray(righthalf);
        return merge(left,right);
    }
    public int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}