class Solution {
    public boolean hasDuplicate(int[] nums) {

        int j=0;
        int i=0;

        Arrays.sort(nums);
        for (i=0; i<nums.length-1; i++){
         
         if( nums[i] != nums[i+1]){
            j++;
         }
            
        }
        if(i!=j){
            return true;
        }
        else {
            return false;
        }
        
    }
}