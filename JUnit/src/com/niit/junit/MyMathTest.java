package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest
{
	MyMath myMath = new MyMath ();
	
	@Test
	public void sum_with3numbers ()
	{
		System.out.println("Test 1");
		assertEquals(6, myMath.sum(new int [] {1, 2, 3} ) );
	}
	
	@Test
	public void sum_with1number ()
	{
		System.out.println("Test 2");
		assertEquals(3, myMath.sum(new int [] {3} ) );
	}

	/**@Test
	public void testMyMath()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSum()
	{
		fail("Not yet implemented");
	}*/

}