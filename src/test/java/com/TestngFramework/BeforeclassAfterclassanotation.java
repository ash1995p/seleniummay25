package com.TestngFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeclassAfterclassanotation {
	
	@BeforeClass
	public void login()
	{
		System.out.println("login");
	}
	
	@Test
	public void search()
	{
		System.out.println("search");
	}
	
	@Test
	public void advsearch()
	{
	  System.out.println("advsearch");	
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("logout");
	}

}
