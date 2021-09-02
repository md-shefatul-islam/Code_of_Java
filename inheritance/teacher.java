class Teacher extends Person{
	
	private String id;
	private double salary;
	
	public Teacher()
	{
	System.out.println("the empty cons");
	}
	
	public Teacher(String n,int a, String g,String i,double s)
	{
		super(n,a,g);
		id=i;
		salary=s;
	}
	
	public void setId(String i)
	{
		id=i;
	}
	public void setSalary(double s)
	{
		salary=s;
	}
	
	public String getId()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void ShowInfo()
	{
		System.out.println("name ="+getName());
		System.out.println("age ="+getAge());
		System.out.println("gender ="+getGender());
		System.out.println("id ="+id);
		System.out.println("slary ="+salary);
	}
}