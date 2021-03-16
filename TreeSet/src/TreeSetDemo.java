import java.util.*;

class Employee implements Comparable
{
	String name;
	int eid;
	double salary;
	int department;
	int age;
	
	Employee(String name,int eid,double salary,int department,int age)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.department=department;
		this.age=age;
	}
	
	public String toString()
	{
		return name+".."+eid+".."+salary+".."+department+".."+age;
	}
	
	public int compareTo(Object obj)
	{
	
		String name1=this.name;
		Employee e=(Employee)obj;
		String name2=e.name;
		return name1.compareTo(name2);
			
		
			
	}
	
	}

public	class TreeSetDemo {
	
	public static void main(String[] args)
	{
		Employee e1= new Employee("agee",101,1000.5,12,23);
		Employee e2= new Employee("barak",102,2000.5,13,24);
		Employee e3= new Employee("kath",103,2001.5,13,25);
		
		TreeSet t=new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		TreeSet t1=new TreeSet(new MyComparator());
	
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		
		
		
	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
        Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		//Double salary1=(Double)obj1;
		//Double salary2=(Double)obj2;
		Double salary1=e1.salary;
		Double salary2=e2.salary;
		return salary1.compareTo(salary2);
		
			
	
		
	}

}
	

