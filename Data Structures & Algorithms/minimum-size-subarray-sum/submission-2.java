class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum=0;
        int minSize= Integer.MAX_VALUE;
        int left=0;
        for(int right=0; right< nums.length; right++){
            
           sum+= nums[right];

           while(sum>= target){
               
               minSize= Math.min(minSize, right-left+1);
               sum-=nums[left];
               left++;
           }

        }

        return minSize == Integer.MAX_VALUE ? 0: minSize;
        
    }
}