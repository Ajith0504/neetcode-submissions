class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int sum = 0;
        // int[] arr = new int[2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         sum = nums[i] + nums[j];
        //         if(sum == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return arr;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
