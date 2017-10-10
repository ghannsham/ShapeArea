package com.gk.rest.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gk.rest.model.Shape;

public class TestAreaService {

	AreaService svc = new AreaService();
	@Test
	public void test_calculateArea_success() {
		Shape shape = new Shape(3,4);
		long expectedValue = 12;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void test_calculateArea_lengthZero() {
		Shape shape = new Shape(0,4);
		long expectedValue = 16;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test_calculateArea_widthZero() {
		Shape shape = new Shape(4,0);
		long expectedValue = 16;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test(expected=NullPointerException.class)
	public void test_calculateArea_exception() {
		Shape shape = null;
		long expectedValue = 16;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test_calculateArea_Zero() {
		Shape shape = new Shape(0,0);
		long expectedValue = 0;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test_calculateArea_Negative() {
		Shape shape = new Shape(-2,-100);
		long expectedValue = 0;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test_calculateArea_NegativeLength() {
		Shape shape = new Shape(-2,100);
		long expectedValue = 10000;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test_calculateArea_NegativeWidth() {
		Shape shape = new Shape(2,-100);
		long expectedValue = 4;
		long actualValue = svc.calculateArea(shape);
		assertEquals(expectedValue, actualValue);
	}
}
