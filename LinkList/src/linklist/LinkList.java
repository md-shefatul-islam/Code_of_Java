
package linklist;

import java.util.LinkedList;


public class LinkList {

   
    public static void main(String[] args) {
       LinkedList<String>name= new LinkedList<String>();
       
       name.add("A");
       name.add("B");
       name.add("C");
       name.add("D");
       name.add("E");
      
      
       name.add(5,"f");
       name.addFirst("g");
       name.addLast("h");
       
        System.out.println(name);
        
        for(String x : name)
        {
            //System.out.println(x);
        }
        System.out.println("size of the list : "+name.size());
         //name.remove("g");
         //name.removeFirst();
         //name.removeLast();
         
          System.out.println(name.getFirst());
          System.out.println(name.getLast());
          
          name.clear();
         
          System.out.println(name);
    }
    
}
