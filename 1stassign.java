class Person
{
	private String name;
	private String address;
	public Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "Person[name="+name+",address="+address+"]";
	}
}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	public Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public String getProgram()
	{
		return program;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public double getFee()
	{
		return fee;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public String toString()
	{
		return "Student["+super.toString()+",program="+program+",year="+year+",fee="+fee+"]";
	}
}
class Staff extends Person
{
	private String school;
	private double pay;
	public Staff(String name,String address,String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public String getSchool()
	{
		return school;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public double getPay()
	{
		return pay;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public String toString()
	{
		return "Staff["+super.toString()+",school="+school+",pay="+pay+"]";
	}
	public static void main(String args[])
	{
		Student std=new Student("Student1","Andhra Pradesh","Staff development program",2016,0.0);

		System.out.println("Student Details are...");
		System.out.println("Student name is "+std.getName());
		System.out.println("Student address is "+std.getAddress());
		System.out.println("Program name is "+std.getProgram());
		System.out.println("Year is "+std.getYear());
		System.out.println("Fee is "+std.getFee());

		std.setAddress("abcd");
		std.setProgram("PHP training");
		std.setYear(2017);
		std.setFee(1000.0);
		System.out.println("Student Details after change are...");
		System.out.println("Student address is "+std.getAddress());
		System.out.println("Program name is "+std.getProgram());
		System.out.println("Year is "+std.getYear());
		System.out.println("Fee is "+std.getFee());

		System.out.println("Staff Details are...");
		Staff stf=new Staff("BVC","Amalapuram","xx school",10000.0);
		System.out.println("Staff name is "+stf.getName());
		System.out.println("Staff address is "+stf.getAddress());
		System.out.println("Staff school is "+stf.getSchool());
		System.out.println("Staff pay is "+stf.getPay());

		stf.setAddress("abcd");
		stf.setSchool("yy school");
		stf.setPay(15000.0);

		System.out.println("Staff Details after change are...");
		System.out.println("Staff address is "+stf.getAddress());
		System.out.println("Staff school is "+stf.getSchool());
		System.out.println("Staff pay is "+stf.getPay());
}
}