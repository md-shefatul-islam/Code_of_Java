
package javabasic;

import java.util.Scanner;


public class SmallCapital {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    char ch;
    System.out.println("enter a letter : ");
    ch=input.next().charAt(0);
    
    if(ch>='a' && ch<='z')
    {
      System.out.println("letter is small");  
    }
    else if(ch>='A' && ch<='Z')
    {
        System.out.println("letter is capital ");
    }
    else
    {
    System.out.println("not letter ");
    }
    }
    }

