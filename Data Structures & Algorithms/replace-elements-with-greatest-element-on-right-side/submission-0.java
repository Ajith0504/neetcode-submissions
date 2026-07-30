class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length, max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                max = Math.max(arr[j], max);
            }
            arr[i] = max;
            max = 0;
        }
        arr[n-1] = -1;
        return arr;
    }
}