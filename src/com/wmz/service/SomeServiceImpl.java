package com.wmz.service;

import com.wmz.utils.SystemService;

public class SomeServiceImpl implements ISomeService {
	
	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		SystemService.doTx();
		System.out.println("执行主业务逻辑doFirst()");
		SystemService.doLog();

	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		SystemService.doTx();
		System.out.println("执行主业务逻辑doSecond()");
		SystemService.doLog();

	}

}
