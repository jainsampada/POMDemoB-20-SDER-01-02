package com.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HRM.Testbase.TestBase;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class HomeTest {

	HomePage obj;

	@BeforeClass
	public void demo() {
		obj = new HomePage();
	}

	@Test
	public void Logou() {

		obj.logout();
	}
	
}
