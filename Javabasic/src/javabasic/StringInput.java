
package javabasic;

import java.util.Scanner;


public class StringInput {
    
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        String line;
        System.out.println("enter the line ");
        
        line= input.nextLine(); 
        System.out.println("the line is \n"+line);
    }
    
    
}
