package hashmap1;

import java.util.HashMap;

public class HashMap1 {

 
    public static void main(String[] args) {
       
        HashMap<Integer,Integer> customer = new HashMap<Integer,Integer>();
        
        customer.put(101,100);
        
        System.out.println(customer.get(101));
    }
    
}
