class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeroCount = 0;
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                product *= nums[i];
            }
            else{
                zeroCount++;
            }
        }
        if(zeroCount > 1){
            return new int[n];
        }
        for(int i = 0; i < n; i++){
            if(zeroCount > 0){
                if(nums[i] == 0)
                    res[i] = product;
                else
                    res[i] = 0;
            }
            else{
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}  
