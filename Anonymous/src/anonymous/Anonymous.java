
package anonymous;

public class Anonymous {

   
    public static void main(String[] args) {
        A a=new A(){
          void display()
          {
              System.out.println("in test class");
          }
        };
        a.display();
    }
    
}
