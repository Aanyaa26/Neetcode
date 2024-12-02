Date: 02.12.24
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1;
        int count =0;
        int [] ans = new int [nums.length];
        for(int i=0;i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }

                                 
        }
        for(int i=0; i<nums.length;i++){
            if(count ==0){
                product = product*nums[i];
            }

            else if(count ==1 && nums[i]!=0 ){
                product = product*nums[i];
            }
            else if(count ==1 && nums[i]==0){
                continue;
            }
            else{
                product =0;
            }
        }

        
        for(int i=0; i<nums.length; i++){
            if(count==0){
                ans[i] = product/nums[i];
            } 
            else if(count ==1 && nums[i]!=0){
                ans[i]=0;
            }   
            else if(count ==1 && nums[i]==0){
                ans[i]=product;
            } 
            else if(count >1){
                ans[i]=0;
            }       
        }
        return ans;
    }
}  
