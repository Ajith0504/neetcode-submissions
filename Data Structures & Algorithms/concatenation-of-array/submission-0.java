class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();

        return result;
    }
}