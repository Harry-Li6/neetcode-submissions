class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (list.containsKey(complement)) {
                result[0] = list.get(complement);
                result[1] = i;
                return result;
            }

            list.put(nums[i], i);
        }

        return result;
    }
}
