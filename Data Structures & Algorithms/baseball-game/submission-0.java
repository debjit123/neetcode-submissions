class Solution {
    public int calPoints(String[] operations) {

      Stack<Integer> stack= new Stack<Integer> ();

      for(String op: operations){

        if(op.equals("+")){
            int top= stack.pop();
            int newTop= top + stack.peek();
            stack.push(top);
            stack.push(newTop);
        }
        else if( op.equals("D")){
            int top= stack.peek();
            stack.push(top*2);
        }
        else if( op.equals("C")){
            stack.pop();
        }
        else{
            stack.push(Integer.parseInt(op));
        }

      }

      int sum=0;

      for(int st: stack){
          sum+=st;
      }
        
   return sum;     
    }
}