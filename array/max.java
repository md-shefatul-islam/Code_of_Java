class max{
	
    public static void main(String args[]) 
    {
        int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int x=0, max=0;
        
        for(int i=0 ; i<=4 ; i++)
        {
          if(a[i]>max)
		  {
			max=a[i];
			 x=i;
			  
		  }
		  					
        }
		System.out.println("the max num "+max);
		System.out.println("the index "+x); 
    }
}