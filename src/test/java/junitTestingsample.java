

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class junitTestingsample {

	@Test
	public void tcl() {
		System.out.println("Test case1");
		
	}
	
	@Before
	public void start() {
		System.out.println("Test Case Start Date and Time");
		}
	
	@After
	public void endDate() {
		System.out.println("Test Case End Date and Time");
	}
	
	@Test
	public void tc4() {
		System.out.println("Test Case4");
	}
	
	
	@Test
	public void tc2() {
		System.out.println("Test Case2");
		}
	
	@Test
	public void tc3() {
		System.out.println("Test Case3");
		}
	
}
