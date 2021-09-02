
public class Triangle extends Shape{
    
     double base;

              double height;

             

              Triangle()

              {

              }

              Triangle(double base,double height)

              {

                           super(base,height);

              }

              public void setBase(double base)

              {

                           this.base=base;

                          

              }

              public double getBase()

              {

                           return base;

                          

              }

              public void setHeight(double height)

              {

                           this.height=height;

              }

              public double getHeight()

              {

                           return height;

              }

             

              public void displayArea()

              {

                  System.out.println( "arae"+(getDim1()*getDim2())/2);

              }
    
}
