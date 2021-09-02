package hashset;

public class HashSet {

    public static void main(String[] args) {
       
       HashSet<String>name = new HashSet<String> ();
       
       name.add("A");
       name.add("B");
       name.add("C");
       name.add("D");
       name.add("E");
      
      
       name.add(5,"f");
       name.addFirst("g");
       name.addLast("h");
       
        System.out.println(name);
    }
    
}
