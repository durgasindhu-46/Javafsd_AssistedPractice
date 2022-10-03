package com.ex1;

import org.testng.annotations.Test;
import org.testng.annotations.Factory;
class TestDetails1{
	@Test
	public void testmethod() {
		System.out.println("Test Cases1");
	}

	@Test
	public void testmethod1() {
		System.out.println("Test Cases2");
	}

}

class TestDetails2{
	@Test
	public void testmethod() {
		System.out.println("TestDetails'method");
	}
}

public class FactoryExample1 {
	 @Factory
		Object[] factoryMethod1() {
			return new Object[] { new TestDetails1(), new TestDetails2() };
		}
}