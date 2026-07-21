class Solution {
    public boolean isValid(String s) {

        Stack<Character> st= new Stack<>();

        for(char c: s.toCharArray()){

          if((c== '(') || (c== '{')
            ||(c== '[')){

               st.push(c);
            }
         else if((c== ')')|| (c== '}')
            ||(c== ']' )){

                if (st.isEmpty()) return false; 

                char firstElement= st.peek();

                if((c== ')' && firstElement !='(') ||
                   (c== '}' && firstElement !='{') ||
                   (c== ']' && firstElement !='[')){

                    return false;

                   }

            st.pop();
            }

        }

        return st.isEmpty(); 
        
    }
}
