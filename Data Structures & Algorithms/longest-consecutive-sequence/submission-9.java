class Solution {
    public int longestConsecutive(int[] nums) {

    Set<Integer> hashSet= new HashSet<Integer>();
      
    
      int maxCount=0;

      if(nums.length==0){
        return 0;
      }
      for( int num: nums){
        hashSet.add(num);
      }

      for( int i=0; i< nums.length; i++){
        
        int count=1;
        if(hashSet.contains(nums[i]) && !hashSet.contains(nums[i]-1)){
          
          int current=nums[i]+1;
          while( hashSet.contains(current)){
            count++;
            current++;
           }
        }

        maxCount=Math.max(maxCount, count);
        
      }

    return maxCount;

    }
}
