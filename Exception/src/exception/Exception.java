
package exception;


public class Exception {
    public static void main(String[] args) {
      try{  
        int x=10;
        int y= 0;
        int result = x/y;
        System.out.println("result"+result);
      }
      catch(ArithmeticException e)
      {
         System.out.println("exception : "+e);
      }
      catch(NullPointerException e1){
          System.out.println("exception"+e1);
      }
     
       
      finally{
              System.out.println("last line of the programme");
              }  
    }
}


