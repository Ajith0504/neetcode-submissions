class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int sum = 0;
        // for(int i = 0; i < numbers.length-1; i++){
        //     for (int j = i+1; j < numbers.length; j++){
            
        //         if(numbers[i] + numbers[j] == target)
        //                 return new int[]{i+1,j+1};
        //     }
        // }
        // return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int diff = target - numbers[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i+1};
            }
            map.put(numbers[i],i+1);
        }
        return new int[]{};
    }
}
