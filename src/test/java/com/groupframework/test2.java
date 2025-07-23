package com.groupframework;

import org.testng.annotations.Test;

public class test2 {
	
	@Test(groups= {"smoke"})
	public void a1()
	{
		System.out.println("class test2 ... smoke executed");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void a2()
	{
		System.out.println("class test2 ... smoke ,sanity executed");
	}
	
	@Test(groups="regression")
	public void a3()
	{
		System.out.println("class test2 ... regression executed");
	}
	
	@Test(groups="sanity")
	public void a4()
	{
		System.out.println("class test2 ... sanity executed");
	}

}
