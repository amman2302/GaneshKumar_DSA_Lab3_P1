package com.gl.fssd.lab3.main;
import java.util.Scanner;
import com.gl.fssd.lab3.algo.*;

public class DriverClass {
    public static void main(String[] strArg)
    {
        boolean bIsBalanced = false;
        try{
            Scanner oSc = new Scanner(System.in);
            System.out.println("Enter a string with brackets to check whether its balanced or not \n ");
            String strInput = oSc.nextLine();
            BalancedParenthese oBalancedParenthese = new BalancedParenthese();
            bIsBalanced = oBalancedParenthese.checkIsBalanceBrackets(strInput);
            if(bIsBalanced){
                System.out.println("The entered String has Balanced Brackets");
            }else{
                System.out.println("The entered Strings do not contain Balanced Brackets");
            }//End of else block
        }catch(Exception oException){
            System.out.println("Exception occured "+oException.getMessage());
        }//End of try-catch block  
    }//End of main method
}//End of DriverClass