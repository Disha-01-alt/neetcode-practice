class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int amt=0;
        while(left < right){
            amt=Math.max(amt, (right-left)*Math.min(heights[left], heights[right]));
            if(heights[left]<=heights[right]){
                left++;
            }
            else{
                right--;

            }
        }
        return amt;

        
    }
}
