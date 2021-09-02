
package javaapplication40;

import java.io.File;
import java.util.Scanner;


public class JavaApplication40 {

    
    public static void main(String[] args) {
        
        try{
           File f= new File("C:\\Users\\ASUS\\Desktop\\File2\\f\\hap.txt"); 
           Scanner read = new Scanner(f);
           
           while(read.hasNext())
           {
          int id = read.nextInt();   
          String name = read.next(); 
          System.out.println("id : "+id+" name "+name);
          
           }
           read.close();
           
        }catch(Exception e)
        {
            System.out.println("exception"+e);
        }
    }
    
}
