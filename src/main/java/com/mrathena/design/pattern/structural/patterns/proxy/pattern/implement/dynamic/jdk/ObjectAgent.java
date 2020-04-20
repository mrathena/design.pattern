package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ObjectAgent implements InvocationHandler {

	private Object target;

	public ObjectAgent(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		Object invoke = method.invoke(target, args);
		System.out.println("after");
		return invoke;
	}

	public static Object getProxy(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new ObjectAgent(target));
	}

}
