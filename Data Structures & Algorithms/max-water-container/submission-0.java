class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        for(int i=0; i< heights.length; i++){

            int minLength=0;
            for( int j=i+1; j< heights.length; j++){
             
             minLength=Math.min(heights[i], heights[j] );
             
             int area= minLength*(j-i);

             maxArea = Math.max(maxArea, area);

            }
        }

     return maxArea;   
    }
}
