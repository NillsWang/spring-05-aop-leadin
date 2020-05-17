package com.wmz.test;

import org.junit.Test;

import com.wmz.service.ISomeService;
import com.wmz.service.SomeServiceImpl;

public class MyTest {
	@Test
	public void test01() {
		ISomeService service = new SomeServiceImpl();
		service.doFirst();
		System.out.println("-------------------");
		service.doSecond();
	}

}
