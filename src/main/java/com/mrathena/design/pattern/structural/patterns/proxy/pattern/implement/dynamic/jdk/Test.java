package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.jdk;

import java.lang.reflect.Method;

/**
 * @author mrathena on 2020/4/8 22:57
 */
public class Test {

	public static void main(String[] args) throws Throwable {
		Singer singer = new SHESinger();

		Singer proxy = SingerAgent.getProxy(singer);
		proxy.sing();

		System.out.println();

		Object objectProxy = ObjectAgent.getProxy(singer);
		Method method = objectProxy.getClass().getDeclaredMethod("sing", null);
		method.invoke(objectProxy, null);
	}

}
