package Sumpackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SumofTwoTest {
	SumofTwo st=new SumofTwo();
	@Before
	public void BeforeTest()
	{
		System.out.println("Print Before");
	}
	@After
	public void AfterTest()
	{
		System.out.println("Print Before");
	}
	@Test
	public void testsumtwo() { 
		Object String1 = null;
		assertEquals(4,st.sumtwo(2, 2)); 
		assertNotEquals(1,st.sumtwo(3,3));
		assertFalse(st.sumtwo(2,2)==1);
		assertTrue(st.sumtwo(4,4)==8);
		assertSame("Valid",10,st.sumtwo(5,5));
		assertNotSame("Invalid",6,st.sumtwo(5,5));
		assertNotNull(null,st.sumtwo(2,2)==2);
		assertNull(String1);
	}

}
