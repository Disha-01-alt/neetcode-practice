class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> lst =new ArrayList<>();
        for(int i=0; i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum>-nums[i]){
                    k--;
                }
                else if(sum<-nums[i]){
                    j++;
                }
                else{
                    List<Integer> lst1=new ArrayList<>();
                    lst1.add(nums[i]);
                    lst1.add(nums[j]);
                    lst1.add(nums[k]);
                    lst.add(lst1);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return lst;

        
    }
}
