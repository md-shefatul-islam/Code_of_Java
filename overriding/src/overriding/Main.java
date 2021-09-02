
package overriding;


public class Main {
    public static void main(String[] args)
    {
       Overriding1 a =new  Overriding1();
       a.name="unknown";
       a.age=25;
       a.id=1234;
       a.add= 121;
       a.display();
       
       Overriding b =new  Overriding();
       b.name="unknown";
       b.age=25;
       //b.add=10;
       b.display();
    }
    
}
