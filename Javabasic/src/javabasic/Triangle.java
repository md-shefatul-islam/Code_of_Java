
package javabasic;

import java.util.Scanner;


public class Triangle {

            
   public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in); 
    double base,height,area,radious;
    
    System.out.print("enter base :");
    base= input.nextDouble();
    
    System.out.print("enter base :");
    height=input.nextDouble();
    
    area= .5*base*height;
      System.out.println("area of triangle :"+area);
      
      System.out.print("enter radious :");
      radious=input.nextDouble();
      
      area=3.1416*radious*radious;
      System.out.println("area of circle :"+area);
    
     
   }
   }
           
           
    

