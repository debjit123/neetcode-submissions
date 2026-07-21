class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char charArrayS[]= s.toCharArray();
        char charArrayT[]= t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        for( int i=0; i< s.length(); i++){
            if(charArrayS[i] != charArrayT[i]){
                return false;
            }
        }

        

     return true;

    }
}
