
package javabasic;


public class foreachLoop {
    
    public static void main(String[] args)
    {
    
    int[] n= new int[5];
        
        n[0]=1;
        n[1]=2;
        n[2]=3;
        n[3]=4;
        n[4]=5;
        
        for(int i=0; i<5 ; i++)
                {
        System.out.println("the array : n["+i+"] = "+n[i]);
    
}
        
         int sum = 0;
         for(int i:n )
         {
             sum =sum+i;
         }
         System.out.println("the sum of array : "+sum);
         
         System.out.println("the length of array : "+n.length); //give length
         double avg= sum/n.length;
         System.out.println("the avg of array ; "+avg);
    }
}
