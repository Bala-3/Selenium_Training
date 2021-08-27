package Sumpackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal =new Calculator();
	String c;
	@Before
	public void Before()
	{
	System.out.println("Before Test");
	}
	
	@After 
	public void After()
	{
		System.out.println("After Test");
	}
	@Ignore
	@Test
	public void testAdd() 
	{
		assertEquals(4,cal.add(2, 2)); 
		assertNotEquals(1,cal.add(3,3));
		assertFalse(cal.add(2,2)==1);
		assertTrue(cal.add(4,4)==8);
		assertSame("Valid",10,cal.add(5,5));
		assertNotSame("Invalid",6,cal.add(5,5));	
	}

	@Test
	public void testSub() 
	{
		assertEquals(0,cal.sub(2,2)); 
		assertNotEquals(0,cal.sub(3,2));
		assertFalse(cal.sub(2,2)==1);
		assertTrue(cal.sub(8,4)==4);
		assertSame("Valid",5,cal.sub(10,5));
		assertNotSame("Invalid",5,cal.sub(12,6));
	}
	
	@Test(expected=ArithmeticException.class)
	public void test1() 
	{
		int a,b,c;
		a=1;
		b=0;
		c=a/b;
		System.out.println(c);
	}
	
	@Test(expected=NullPointerException.class)
	public void test2() 
	{
	    c=null;
		System.out.println(c.length());
	}
	
	@Test(expected=NumberFormatException.class)
	public void test3() 
	{
		c="Ball";
		int a=Integer.parseInt(c);
		System.out.println(a);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test4() 
	{
		int a[]= new int[10];
		a[20]=100;
		System.out.println(a);
	}
	
	@Test(timeout=1000)
	public void test5()
	{
		int i=1;
		while(i==5)
		{
			System.out.println(i);
		}
	}
}
