package com.example1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();

  @Test(dataProvider="dpadd")
  public void add(int exp,int a, int b) 
  {
    Assert.assertEquals(4,cal.add(2, 2));
    Assert.assertEquals(exp,cal.add(a, b));
  }

  @Test(dataProvider="dpsub")
  public void sub(int exp1,int x, int y) 
  {
	  Assert.assertEquals(4,cal.sub(6, 2));
	  Assert.assertEquals(exp1,cal.sub(x,y));
  }
  
  @DataProvider(name="dpadd")
  public Object[][] getData()
  {
	  Object[][]values=new Object[][]{
		  {20,10,10},
		  {30,15,15}
	  };
	return values;
		  

			  }
  
  @DataProvider(name="dpsub")
  public Object[][] getData1()
  {
	  Object[][]values=new Object[][]{
		  {20,30,10},
		  {30,50,20}
	  };
	return values;
		  

			  }
  
  }
