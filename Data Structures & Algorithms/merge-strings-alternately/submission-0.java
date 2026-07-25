class Solution {
    public String mergeAlternately(String word1, String word2) {

        int i=0;
        int j=0;
        int k=0;
        if(word1.length()> word2.length()){
            k= word1.length();
        }
        else {
            k= word2.length();
        }
        String result="";
        for(int l=0; l<k; l++){
            
            if(i<word1.length()){
              result = result.concat(String.valueOf(word1.charAt(i)));             }

            if(j<word2.length()){
               result = result.concat(String.valueOf(word2.charAt(j)));             }

            i++;
            j++;
        }
        return result;
        
    }
}