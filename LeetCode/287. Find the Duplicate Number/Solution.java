public class Solution {
    
    public int findDuplicate(int[] nums) {
    
        int duplicateNumber = 0;
        
        for(int i=0; i<nums.length; i++){
          
            if(nums[Math.abs(nums[i])-1]<0)
                duplicateNumber = Math.abs(nums[i]);
        
            else
                nums[Math.abs(nums[i])-1]*=-1;
                
        }
        
        return duplicateNumber;
    }
}