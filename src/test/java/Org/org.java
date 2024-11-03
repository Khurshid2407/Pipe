package Org;

import org.testng.annotations.Test;

public class org {
	
	@Test(groups = "smoke")
	public void test01() {
		System.out.println("Org -> Smoke testing");
	}

	@Test(groups = "regression")
	public void test02() {
		System.out.println("Org -> regression testing");
	}
}
