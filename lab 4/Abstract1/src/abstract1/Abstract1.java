
package abstract1;


public class Abstract1 {

   
    public static void main(String[] args) {
        
        Shape s;
       
        
        s = new  Rectange(10,20);
         s.show();
        s.area();
        
        s = new Triangle(20,30);
        s.area();
        
        s = new Circle(10);
        s.area();  
    }
    
}
