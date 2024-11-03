package Org;

import org.testng.annotations.Test;

public class org {
	
	@Test(groups = "smoke")
	public void test01() {
		String browser=System.getProperty("browser");
		String env=System.getProperty("env");
		System.out.println(browser);
		System.out.println(env);
		System.out.println("Org -> Smoke testing");
	}

	@Test(groups = "regression")
	public void test02() {
		String browser=System.getProperty("browser");
		String env=System.getProperty("env");
		
		System.out.println(browser);
		System.out.println(env);
		System.out.println("Org -> regression testing");
	}
	
	@Test(groups = "retest")
	public void test03() {
		String browser=System.getProperty("browser");
		String env=System.getProperty("env");
		
		System.out.println(browser);
		System.out.println(env);
		System.out.println("Org -> retest testing");
	}
}
