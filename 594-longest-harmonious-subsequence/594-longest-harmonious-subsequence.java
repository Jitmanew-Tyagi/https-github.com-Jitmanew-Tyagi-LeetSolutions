class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i : nums) hm.put(i, hm.getOrDefault(i, 0) + 1);
        int max = 0;
        for(int i : hm.keySet()) max = Math.max(max, hm.containsKey(i + 1) ? hm.get(i) + hm.get(i + 1) : 0);
        return max;
    }
}