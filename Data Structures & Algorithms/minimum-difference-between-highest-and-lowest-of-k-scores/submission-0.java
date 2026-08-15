class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int j=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i< nums.length; i++){

          if(i-j+1 == k){
            int lowest= nums[j];
            int highest= nums[i];
            j++;
            min=Math.min(min, highest-lowest);
          }
        }
     return min;
    }
}