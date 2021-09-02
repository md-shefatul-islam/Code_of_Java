package privateprotected;
import newpakage.C;

public class A extends C {
    public static void main(String[] args)
    {
    A a= new A();
   a.display(); //for default cannot access= error
                //for public is correct
                //for private is error
                //for protected is correct
    } 
}
