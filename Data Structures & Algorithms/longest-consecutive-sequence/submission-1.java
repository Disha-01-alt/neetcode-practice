class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
         for (int v : nums) {
            set.add(v); 
        }
        int maxcount=0;
        int currnum=0;
        for(int i=0; i<nums.length;i++){
            currnum=nums[i];
            if(set.contains(nums[i]-1)){
                currnum=nums[i]-1;


            }
            int l=0;
            while(set.contains(currnum)){
                l+=1;
                currnum+=1;


            }
           maxcount = Math.max(maxcount, l);


        }
        return maxcount;
        
    }
}
