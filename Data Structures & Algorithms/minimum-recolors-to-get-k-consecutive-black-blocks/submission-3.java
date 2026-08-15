class Solution {
    public int minimumRecolors(String blocks, int k) {

        int minCount=Integer.MAX_VALUE;
        int left=0;
        int count=0;
        
        for(int right=0; right<blocks.length(); right++){
              if(blocks.charAt(right)=='W'){
                count++;
              }
              if(right-left+1==k){
                minCount= Math.min(minCount,count);
                if(blocks.charAt(left)=='W'){
                    count--;
                }
                left++;
              }        
            }
           return minCount; 
        }    
    }