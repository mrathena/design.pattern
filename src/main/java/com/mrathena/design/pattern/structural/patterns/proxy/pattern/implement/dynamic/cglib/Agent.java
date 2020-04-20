package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mrathena on 2020/4/8 22:42
 */
public class Agent implements InvocationHandler {

	private SHESinger singer;

	public Agent(SHESinger singer) {
		this.singer = singer;
	}

	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		System.out.println("演出前商谈");
		Object result = method.invoke(singer, args);
		System.out.println("演出后分钱");
		return result;
	}

	public static SHESinger getProxy(SHESinger singer) {
		return (SHESinger) Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), new Agent(singer));
	}


}
