class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        List<Integer> lst=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                lst.add(nums1[i]);
                i++;
            }
            else{
                lst.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            lst.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            lst.add(nums2[j]);
            j++;
        }
        int n=lst.size();
        if(n%2==0){
            return (lst.get(n/2)+lst.get(n/2-1))/2.0;

        }
        else{
            return lst.get(n/2);
        }

        
    }
}
