class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;

        // find pivot (min index)
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= nums[r]) r = mid;
            else l = mid + 1;
        }
        int pivot = l;

        int left, right;
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            left = pivot;
            right = n - 1;
        } else {
            left = 0;
            right = pivot - 1;
        }

        while (left <= right) {
            int m = left + (right - left) / 2;
            if (nums[m] < target) left = m + 1;
            else if (nums[m] > target) right = m - 1;
            else return m;
        }
        return -1;
    }
}