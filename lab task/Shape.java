
abstract public class Shape {
    double dim1;
    double dim2;

    Shape()
            {   
            }
    
    Shape( double dim1,double dim2)
    {
      this.dim1=dim1;
      this.dim2=dim2;
    }

    public double getDim1() 
    {
        return dim1;
    }
    

    public double getDim2() 
    {
        return dim2;
    }
    
     
     abstract void dispalyArea();
   
}
