package testExample;

import org.testng.annotations.Test;

public class TestNG01 {

	//public static void main(String [] args) {
	@Test
	public void testCase01() {
		
		System.out.println("\nThe Test is run by TestNG Framework - Test01.");

	}

	@Test
	public void testCase02() {
		
		System.out.println("\nThe Test is run by TestNG Framework - Test02.");

	}
	
	@Test
	public void testCase03() {
		
		System.out.println("\nThe Test is run by TestNG Framework - Test03.\n");

	}
}

