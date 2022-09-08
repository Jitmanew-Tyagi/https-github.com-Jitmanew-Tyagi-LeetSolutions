class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length, s = 0, e = n - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] >= target) e = mid - 1;
            else s = mid + 1;
        }
        return e + 1;
    }
}