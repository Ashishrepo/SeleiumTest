package org.selenium.sample;

import java.util.Comparator;
import java.util.TreeSet;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TreeSetcomparison {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(3, "Ashish");
		
		Employee e2 = new Employee(1, "Ben");
		Employee e3 = new Employee(2, "Chiru");
		Employee e4 = new Employee(4, "Don");
		
		
		
		TreeSet<Employee>te= new TreeSet<Employee>(new MyComparator123());
		te.add(e1);
		te.add(e2);
		te.add(e3);
		te.add(e4);
		
		System.out.println(te);
		
	}

}




class Employee{
	
	int id;
	String name;
	
	public String toString() {
		return name+"-----"+id;
	}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	
}

class MyComparator123 implements Comparator{

	public int compare(Object o1, Object o2) {
		
		Employee eobj1=(Employee)o1;
		Employee eobj2= (Employee)o2;
		
		String s1= eobj1.name;
		String s2 = eobj2.name;
		
		Integer id1=eobj1.id;
		Integer id2= eobj2.id;		
		
		//return s1.compareTo(s2); // based on name
		return id1.compareTo(id2); // based on Id
	}
	
	
	
}
