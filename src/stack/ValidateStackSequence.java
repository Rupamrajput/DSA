package stack;

import java.util.Stack;

public class ValidateStackSequence {

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0, j=0;
        while (i<pushed.length || j<popped.length){
            if(i<pushed.length && pushed[i]==popped[j]){
                j++;
                i++;
            }
            else {
                if(stack.contains(popped[j])){
                    if(popped[j]!=stack.peek()) return false;
                    else {
                        stack.pop();
                        j++;
                    }
                }
                else if(i<pushed.length){
                    stack.push(pushed[i]);
                    i++;
                }
            }
        }
        return true;
    }
}
