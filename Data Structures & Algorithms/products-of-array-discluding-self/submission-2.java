class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int pro=1;
        int pro1=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
            pro*=nums[i];
            }
            else{
                count+=1;
            }
            pro1*=nums[i];

        }
        if(count>1){
            for(int i=0;i<nums.length;i++){
                arr[i]=0;
            }
            return arr;

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            arr[i]=pro1/nums[i];
            }
            else{
                arr[i]=pro;
            }
        }
        return arr;


        
    }
}  
