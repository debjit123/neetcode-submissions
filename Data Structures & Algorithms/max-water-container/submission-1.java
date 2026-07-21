class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right= heights.length-1;
        
        int maxArea=0;
        
        while(left<right){

         int minLength=Math.min(heights[left],heights[right]) ;
         int area= minLength*(right-left);
         
         maxArea= Math.max(maxArea, area);

         if(minLength==heights[left]){
            left++;
         }
         else{
            right--;
         }

        }
      return maxArea;  
    }
}
