
package javabasic;

import java.util.Scanner;

public class VowelCons {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    char ch;
    System.out.println("enter a letter : ");
    ch=input.next().charAt(0);
    
   /* if(ch=='a')
    {System.out.println("letter is V");}
    
    else if(ch=='e')
           {System.out.println("letter is V");}
    
    else if(ch=='i')
           {System.out.println("letter is V");}
    
    else if(ch=='o')
           {System.out.println("letter is V");}
    
    else if(ch=='u')
    {System.out.println("letter is V");} */
   
   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='e')
       {System.out.println("letter is V");}
   
    else
           {System.out.println("letter is C");}
    }
    
}
