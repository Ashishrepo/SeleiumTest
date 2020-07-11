package org.selenium.sample;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeComparison {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> it= new TreeSet<Integer>(new Mycomparator());
		it.add(1);
		it.add(2); //2.compareTo(1)
		it.add(3); // 3.compareTo(1) then further comparison
		it.add(4);
		it.add(4);
		
		
		System.out.println(it);
		
		TreeSet<String> it1= new TreeSet<String>(new Mycomparator1());
		it1.add("Ashish");
		it1.add("Barish");
		it1.add("Chethan");
		it1.add("Dev");
		it1.add("Eshan");
		
		System.out.println(it1);
	
	
	TreeSet it2= new TreeSet(new Mycomparator2());
	it2.add("A");
	it2.add("BCD");
	it2.add("DD");
	it2.add("CVFG");
	it2.add("BB");

	
	System.out.println(it2);
}
		
		
		
	}


class Mycomparator implements Comparator{

	public int compare(Object o1, Object o2) {
		
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		return I2.compareTo(I1); //Descending order
		
		
	}
	
	
	
}


class Mycomparator1 implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		
		return s2.compareTo(s1);
	}
	
}
	class Mycomparator2 implements Comparator{
		
		public int compare(Object obj1,Object obj2) {
			String s1=obj1.toString();
			String s2=obj2.toString();
			
						
				if(s1.length()>s2.length()) {
					return 1;
				}else if(s1.length()<s2.length()) {
					return -1;
				}else {
					return s1.compareTo(s2);
			}
			
			
		}
}
