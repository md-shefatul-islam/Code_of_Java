
package abstract1;

public abstract class Shape {
    
    double dim1;
    double dim2;
    
    Shape(double dim1,double dim2)
    {
      this.dim1=dim1;
      this.dim2=dim2;
    }
    
    void show()
    {
        System.out.println("the area");
    }
    
    abstract void area();
}
