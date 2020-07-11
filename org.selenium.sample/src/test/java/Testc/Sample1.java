package Testc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class Sample1 {

	public static void main(String[] args) {
		
		
		String k= "Welcome to Collebra";
		
		System.out.println("Reversing each word in a string");
		String []p=k.split(" ");
		for(int i=0;i<p.length;i++) {
			String e=p[i];
			for(int j=e.length()-1;j>=0;j--) {
				System.out.print(e.charAt(j));
				
				
			}
			System.out.print(" ");
		
			
		}
		System.out.println();
		
		
		
		
		
		
		System.out.println("Ascending without Duplicates");
		Integer [] s= {12,89,6,43,67,43,12,89,1};
		TreeSet<Integer>t= new TreeSet<Integer>(Arrays.asList(s));
		System.out.println(t);
		
		
		for(int i=0;i<s.length;i++) {
			int temp=0;
			for(int j=i+1;j<s.length;j++) {
				if(s[i]<s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("Second Highest: "+s[1]);
		System.out.println();
		
		
		
		
		
		
		
		Integer [] srt= {12,89,6,43,90,6,89,34};
		
		Arrays.sort(srt);
		System.out.println("Ascending");
	    for(int j:srt) {
	    	System.out.print(j+" ");
	    	//System.out.print(" ");
	    }
	    
	    List<Integer>op= new ArrayList<Integer>(Arrays.asList(srt));
	    System.out.println("***"+op);
	    System.out.println();
	    Arrays.sort(srt, Collections.reverseOrder());
	    System.out.println("Descending");
	    for(int j:srt) {
	    	System.out.print(j+" ");
	    	//System.out.print(" ");
	    }
	    System.out.println();
	    System.out.println(" Custom Sorting :Descending");
	    Arrays.sort(srt, new A());
	    for(int j:srt) {
	    	System.out.print(j+" ");
	    	
	    	
	    }
	    System.out.println();
	    
	    
	    //
	    System.out.println("Same Insertion Order but no Duplicates");
	    Integer my_arr[] = {55, 67, 99, 11, 54, 55, 88, 99, 1, 13, 45};
	    Set<Integer>bn= new LinkedHashSet<Integer>(Arrays.asList(my_arr));
	    System.out.println(bn);
	    
	    
	    
	   
	    
	   
    }
	

		
		

	}


class A implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
	
	
}
	


