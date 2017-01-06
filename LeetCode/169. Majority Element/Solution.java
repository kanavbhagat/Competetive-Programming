public class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==null)
                hm.put(nums[i],1);
            else
                hm.put(nums[i],hm.get(nums[i])+1);
            
            if(hm.get(nums[i])>(nums.length/2))
                return nums[i];
        }
        return 0;
    }
}