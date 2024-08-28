class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : freq.keySet()) {
            if (freq.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }
}
