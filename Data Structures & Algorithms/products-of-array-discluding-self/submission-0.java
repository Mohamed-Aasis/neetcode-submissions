class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] sufix=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prefix[i]=1;
                continue;
            }
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                sufix[j]=1;
                continue;
            }
            sufix[j]=sufix[j+1]*nums[j+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i]*sufix[i];
        }
        return nums;
    }
}  
