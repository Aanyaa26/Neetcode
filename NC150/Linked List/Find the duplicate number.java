Date: 26.03.25
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i =1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
        }
        return 0;
    }
}

--------------FAST AND SLOW APPROACH-----------
    class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast)break;
        }
        int slow2 = 0;
        while(true){
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow==slow2)return slow;
        }
    }
}

