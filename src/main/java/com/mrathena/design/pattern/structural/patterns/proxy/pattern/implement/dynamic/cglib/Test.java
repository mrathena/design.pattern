package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.cglib;

import java.util.concurrent.TimeUnit;

/**
 * @author mrathena on 2020/4/8 22:57
 */
public class Test {

	public static void main(String[] args) throws Throwable {
		SHESinger singer = new SHESinger();
		TimeUnit.DAYS.sleep(1L);
		SHESinger proxy = Agent.getProxy(singer);
		proxy.sing();
	}

}
