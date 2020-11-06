
public class Person {

	private String first;
	private String last;
	private int age;
	
	public Person()
	{
		
	}
	
	public Person(String first, String last)
	{
		this.first=first;
		this.last=last;
	}
	
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setFirst(String first)
	{
		this.first=first;
	}
	
	public void setLast(String last)
	{
		this.last=last;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public String toString() 
	{
		return first + " " + last;
	}
}