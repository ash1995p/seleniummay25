package com.TestngFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Imptestannotations 
{                                                      //@BeforeMethod @AfterMethod annotation//
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=0)
	public void search()
	{
		System.out.println("search");
	}
	
	@Test(priority=1)
	public void advsearch()
	{
		System.out.println("advsearch");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	
	
}
