
public class Circle extends Shape {
      private double radius;

             

               Circle()

              {

                          

               }

              Circle(double radius)

              {

                           this.radius=radius;

              }

              public void setRadius(double radius)

              {

                           this.radius=radius;

              }

              public double getRadius()

              {

                           return radius;

              }

              public void displayArea()

              {

                           System.out.println("Area of circle is: "+3.1416*getDim1()*getDim1());

              }


    
}
