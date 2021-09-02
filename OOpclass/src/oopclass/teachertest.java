
package oopclass;


public class teachertest {

    
    public static void main(String[] args) {
        
       Teacher t= new Teacher();
       t.name="he";
       t.gender="male";
       t.phone=1817464898;
        
       t.show();
        System.out.println("phone="+t.phone);
        
        Teacher s=new Teacher();
        s.name="she";
        s.gender="female";
        s.show();
        
        Teacher u=new Teacher();
        u.takev("it","unknown");
        u.show();
      
    }
    
}
