class Solution {
    public int numRescueBoats(int[] people, int limit) {
       
       Arrays.sort(people);
     //  12233
      // 1245
       int left=0;
       int right= people.length-1;
       int count=0;
       while(left<=right){

         if(people[left]+ people[right]<=limit){
            left++;
         }
         count++;
         right--;

       }

    return count;
        
    }
}