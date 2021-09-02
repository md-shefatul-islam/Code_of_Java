

package pkgsuper;


public class A {

  int x =5;
  
  void me()
  {
      System.out.println("for A"+x);
  }
  
  //super keyward in method
  
  void show()
  {
      System.out.println("in class A");
  }
  //cons overriding
  A()
  {
      System.out.println("inside A");
  }
}
