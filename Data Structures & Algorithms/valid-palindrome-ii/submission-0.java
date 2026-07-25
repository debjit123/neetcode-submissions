class Solution {
    public boolean validPalindrome(String s) {

        int left=0;
        int right= s.length()-1;

        while(left<right){

            if(s.charAt(left) != s.charAt(right)){
              return (isPlaindrome(s, left+1, right) 
               || isPlaindrome(s, left, right-1));
            }

            left++;
            right--;
        }
        return true;        
    }

    public static boolean isPlaindrome( String s, int left, int right){

        while ( left< right){
            if( s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}