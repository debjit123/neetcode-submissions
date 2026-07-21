class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int count=1;
        int maxCount=1;
        if(nums.length==0){
            return 0;
        }
        for( int i=0; i< nums.length-1; i++){

            if( nums[i] == nums[i+1]){
                continue;
            }

            if(nums[i] == nums[i+1]-1){
                count++;
            }
            else {
                count=1;
            }

            maxCount= Math.max(maxCount,count);

        }
    return maxCount;
    }
}
