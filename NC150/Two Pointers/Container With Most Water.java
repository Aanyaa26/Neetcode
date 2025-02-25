Date: 25.02.25
class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int start =0;
        int end = heights.length-1;
        while(start<end){
            int length = Math.min(heights[start], heights[end]);
            int breadth = end-start;
            int area = length*breadth;
            max = Math.max(max, area);
            if(heights[start]<=heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;

    }
}
