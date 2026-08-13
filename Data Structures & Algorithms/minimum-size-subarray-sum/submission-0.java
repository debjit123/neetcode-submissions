class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minSize=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int sum=0;

            for(int j=i; j<nums.length; j++){

                sum =sum+ nums[j];
                if(sum >= target){
                    int size= j-i+1;
                    minSize= Math.min(minSize, size);
                }
            }
        }
        if(minSize== Integer.MAX_VALUE){
            minSize=0;
        }

        return minSize;
        
    }
}