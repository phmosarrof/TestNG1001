package testExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG01 {

	//public static void main(String [] args) {
	
	@AfterTest
	public void testCase01() {
		
		System.out.println("\nThe Test is run by TestNG Framework- Test01");

	}

	@Test
	public void testCase02() {
		
		System.out.println("\nThe Test is run by TestNG Framework- Test02");

	}
	
	@BeforeTest
	public void testCase03() {
		
		System.out.println("\nThe Test is run by TestNG Framework - Test03\n");
		System.out.println("\nCode is added\n");

	}
	@Test
	public void newMethod() {
		
		System.out.println("Evry thing will be fine when you work good");
	}
}

