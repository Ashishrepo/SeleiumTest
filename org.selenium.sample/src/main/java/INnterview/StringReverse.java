package INnterview;

public class StringReverse {

	public static void main(String[] args) {
		
		String d = "My name is Ashish Jain";
		
		String[] splt = d.split(" ");
		System.out.println(splt.length);
		for(int i=splt.length-1;i>=0;i--) {
			
			System.out.print(" "+splt[i]);
		}
	}

}
