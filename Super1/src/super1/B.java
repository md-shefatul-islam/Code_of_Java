
package super1;
public class B extends A {
    
    int c;
    
    B()
    {
        
    }
    B(int x,int y,int c)
    {
        /*a=x;
        b=y;*/
        super(x,y);
            this.c=c; 
}
    void showinfo()
            {
                show();
                System.out.println("c= "+c);
            }
}
