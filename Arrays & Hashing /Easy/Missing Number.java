Date: 29.08.24

class Solution {
    public int missingNumber(int[] nums) { 
        int sum =0;
        int n = nums.length;
        for(int i=0; i<n; i++ ){
            sum = sum + nums[i];
                        
        }int Actual_Sum = (n*(n+1))/2;
            int missing_number = Actual_Sum - sum;
            return missing_number;
        
    }
}
