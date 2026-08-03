class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack= new Stack<>();

        for( char ch: s.toCharArray()){

            if((ch =='(') || (ch=='{') || (ch=='[')){
                stack.push(ch);
            }

            else if((ch ==')') || (ch=='}') || (ch==']')){

            if (stack.isEmpty()) return false; 


            char cha= stack.peek();

            if((ch ==']' && cha != '[') || 
              (ch =='}' && cha != '{') || (ch ==')' && cha != '(')){ 
              
              return false;
            }
            stack.pop();

            }

            
        
        }

        return stack.isEmpty();
        
    }
}
