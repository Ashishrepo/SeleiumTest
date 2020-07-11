import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		
		Integer []a= {8,1,2,3,4,3,2,4,6};
		Set<Integer> s= new HashSet<Integer>(Arrays.asList(a));
		System.out.println(s);
		Set<Integer> s1= new TreeSet<Integer>(Arrays.asList(a));
		System.out.println(s1);
	}

}
