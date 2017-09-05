package com.actitime.tests;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;



@Listeners(com.actitime.generic.ListenersTest.class)
public class SampleTest extends BaseTest 
{
	
@Test
public void m1()
{
	Assert.fail();
}
}
