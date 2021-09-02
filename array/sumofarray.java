
class array{
	
    public static void main(String args[]) 
    {
        int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
	      double sum=0,avg ;
        
        for(int i=0 ; i<=4 ; i++)
        {
          sum = sum+a[i];
        
        }
     System.out.println("the sum of the array"+sum);
	 
	 avg = sum/5;
	 System.out.println("the sum of the array"+avg);
	 
        
    }
    }
    

