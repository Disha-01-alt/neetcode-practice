class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] arr=new int[nums.length];
        int[] suff=new int[nums.length];
        pre[0]=1;
        suff[nums.length-1]=1;
        int i=1;
        int j=nums.length-2;

        while(i<nums.length && j>=0){
            pre[i]=nums[i-1]*pre[i-1];
            i+=1;
            suff[j]=nums[j+1]*suff[j+1];
            j-=1;


        }
        for(int k=0;k<nums.length;k++){
            arr[k]=pre[k]*suff[k];


        }
        return arr;


        
    }
}  
