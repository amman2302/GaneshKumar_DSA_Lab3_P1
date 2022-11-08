package com.gl.fssd.lab3.algo;
import java.util.Deque;   
import java.util.LinkedList;
/*
 * a program of Balancing Brackets, use a suitable data structure 
 * to print whether the string entered is a Balanced Brackets 
 * or Unbalanced String
 */
public class BalancedParenthese {
    private String strOpeningBrackets = "([{<";
    private String strClosingBrackets = ")]}>";

    public boolean checkIsBalanceBrackets(String strInput){
        boolean bIsBalanced = false;
        int iOpenIndex;
        int iCloseIndex;
        int iIndex=0;
        Deque<Character> deque = new LinkedList<>(); 
        try
        {
            for (char ch: strInput.toCharArray()) 
            {
                iIndex = strOpeningBrackets.indexOf(ch);
                if(iIndex!=-1){
                    deque.addFirst(ch);
                }
                else{
                    if (!deque.isEmpty()){
                        iCloseIndex = strClosingBrackets.indexOf(ch);
                        iOpenIndex = strOpeningBrackets.indexOf(deque.peekFirst());
                        if(iCloseIndex==iOpenIndex){
                            deque.removeFirst();
                        }
                        else {
                            return bIsBalanced;
                        }
                    }//end of if block
                }//End of else block
            }//End of for loop
        }catch(Exception objException)
        {
            System.out.println("Exception @checkIsBalanceBrackets method"+objException.getMessage());
            return bIsBalanced;
        }
        bIsBalanced = deque.isEmpty();
        return bIsBalanced;
    }//End of checkIsBalanceBrackets method
}//End of BalancedParenthese class