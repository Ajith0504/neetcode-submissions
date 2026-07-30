class Solution {
    public int[] getConcatenation(int[] nums) {
        // int[] result = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();

        // return result;
        int n = nums.length;
        int[] result = new int[2 * n];
        for(int i = 0; i < n; i++){
            result[i] = result[i + n] = nums[i];
        }

        return result;
    }
}