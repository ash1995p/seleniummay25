package com.groupframework;

import org.testng.annotations.Test;

public class test1 {

	@Test(invocationCount=2,groups="smoke")
	public void m1()
	{
		System.out.println("two time execute same method smoke");
	}
	
	@Test(groups={"smoke","sanity"})
	public void m2()
	{
		System.out.println("in test1 method  smoke sanity ");
	}
	@Test(groups="sanity")
	public void m3()
	{
		
	}
	@Test(groups={"smoke","sanity","regression"})
	public void m4()
	{
		System.out.println("in test1 method smoke.sanity.regression");
	}
	@Test(groups="sanity")
	public void m5()
	{
		System.out.println("in test1 method sanity group ");
	}
	@Test
	public void m6()
	{
		System.out.println("in test1 method no group ");
	}

}
