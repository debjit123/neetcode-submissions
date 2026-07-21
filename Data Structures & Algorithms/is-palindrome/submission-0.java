class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder cleanStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanStr.append(Character.toLowerCase(c));
            }
        }

        int left=0;
        int right= cleanStr.length()-1;

        while(left<right){
          if(cleanStr.charAt(left) == cleanStr.charAt(right)){
            right--;
            left++;
          }
          else {
            return false;
          }
        }       
      return true;  
    }
}


