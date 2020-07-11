package Testc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramtrs {

	
	@Test
	@Parameters({"pm"})
	public void a(String name) {
		System.out.println(name);
	}

}
