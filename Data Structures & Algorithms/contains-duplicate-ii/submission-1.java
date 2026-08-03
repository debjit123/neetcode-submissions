class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        List<Integer> window= new ArrayList<>();

        int left=0;

        for(int right=0; right< nums.length; right++){

            if(right - left > k){
                window.remove(Integer.valueOf(nums[left]));
                left++;
            }

            if(window.contains(nums[right])){
                return true;
            }
            window.add(nums[right]);
        }
       return false; 
    }
}