class Solution {
    public int numIdenticalPairs(int[] nums) {
        int hm[] = new int[101], ans = 0;
        for(int ele : nums) hm[ele] ++;
        for(int ele : hm) ans += (ele * (ele - 1)) / 2;
        return ans;
    }
}