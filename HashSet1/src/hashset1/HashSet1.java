
package hashset1;

import java.util.HashSet;


public class HashSet1 {

   
    public static void main(String[] args) {
        HashSet<String> name=new HashSet<String>();
             name.add("A");
       name.add("B");
       name.add("C");
       name.add("D");
       name.add("E");
      
      
       
        System.out.println(name);
System.out.println("size of the list : "+name.size());
for(String x : name)
        {
            System.out.println(x);
        }

          name.remove("A");
          System.out.println(name);
          
          name.clear();
          System.out.println(name);
          
          System.out.println(name.isEmpty());
     }  
}
