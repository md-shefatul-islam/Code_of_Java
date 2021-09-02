
package javabasic;


public class BreakContinue {
    
public static void main(String[] args)     
{
    
    for(int i=1 ; i<=100 ; i++)
   {
        if(i==10)
        {
        continue;
        }

        System.out.println(i);
    }   
 System.out.println("end");

  for(int i=1 ; i<=100 ; i++)
{
if(i==10)
{
break;
}

System.out.println(i);
}
 System.out.println("start");

}
}


