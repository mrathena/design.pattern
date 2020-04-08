package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mrathena on 2020/4/8 22:42
 */
public class Agent implements InvocationHandler {

	private Singer singer;

	public Agent(Singer singer) {
		this.singer = singer;
	}

	public void before() {
		System.out.println("演出前谈合同");
	}

	public void after() {
		System.out.println("演出后收钱");
	}

	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(singer, args);
		after();
		return result;
	}

	public static Singer getProxy(Singer singer) {
		return (Singer) Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), new Agent(singer));
	}


}
