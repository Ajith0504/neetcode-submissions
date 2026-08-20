class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n-1, area = 0;
        while(left < right){
            area = Math.max(Math.min(heights[left], heights[right]) * (right - left), area);
            if(heights[left] <= heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}
