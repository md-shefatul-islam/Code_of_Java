package exception1;

public class Exception1 {

   
    public static void main(String[] args) {
       
         try{
                int [] c= new int[4];
                c[4]=10;
            }catch(ArithmeticException e)
            {
                System.out.println("exception"+e);
            }
            catch(Exception e1){
                System.out.println("exception"+e1);
            }

            finally
            {
                System.out.println("latline");
            }
    }
    
}
