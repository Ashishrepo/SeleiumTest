package INnterview;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Noduplicate {

	public static void main(String[] args) {

		//Converting to list
		Integer[] a= new Integer[]{1,2,3,4,5,1,2,2};
		List<Integer> ls= Arrays.asList(a);
		Iterator<Integer> itr = ls.iterator();
		System.out.println("List Elements");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Converting to Set
		Set<Integer> st= new HashSet<Integer>(Arrays.asList(a));
		Iterator<Integer> itr1 = st.iterator();
		System.out.println("Set Elements");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}


		// print count of each

		Map<Integer, Integer> mp= new HashMap<Integer, Integer>();

		for(Integer k:a) {

			if(mp.containsKey(k)) {
				mp.put(k, mp.get(k)+1);
			}
			else {
				mp.put(k, 1);
			}
		}


		// Count of each element
		System.out.println("Count of Each Element");
		for(Integer j: mp.keySet()) {
			System.out.println(j+":"+mp.get(j));
		}
		
		

		//		Maximum Count with Value
		System.out.println("Maximum Count with value");
		int ky=0,max=0;
		for(Integer i:mp.keySet()) {
			if(mp.get(i)>max) {
				max=mp.get(i);
				ky=i;

			}

		}
		System.out.println(ky+":"+max);

		
		
		

		// Maximun occurence in a String
		String s="How are you";
			
		Map<Character, Integer> mc= new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char c1 = s.charAt(i);
			if(c1==' ') {
				continue;
			}else {

				if(mc.containsKey(c1)) {
					mc.put(c1, mc.get(c1)+1);
				}
				else {
					mc.put(c1, 1);
				}

			}
		}
		Set<Map.Entry<Character, Integer>>lmc = mc.entrySet();
		char key=' ';
		int maxvalue=0;
		for(Map.Entry<Character, Integer>data:lmc) {
			
			if(data.getValue()>maxvalue) {
				maxvalue=data.getValue();
				key=data.getKey();
			}
		}
		
		System.out.println(key+":"+maxvalue);




	}
}
