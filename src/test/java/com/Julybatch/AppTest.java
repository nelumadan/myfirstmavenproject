package com.Julybatch;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest
{
	@Test
	public void testLogin1()
	{
		App myapp=new App();//creating an object of the App class.
		AssertJUnit.assertEquals(0,myapp.userLogin("abc", "abc123"));//comparing the result from App class by calling the method from that class and providing parameters
	}
	
	@Test
	public void testLogin2()
	{
		App myapp=new App();
		AssertJUnit.assertEquals(1,myapp.userLogin("abc", "abc@123"));
	}
}
