package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mrathena on 2020/4/8 22:42
 */
public class SingerAgent implements InvocationHandler {

	private Singer singer;

	public SingerAgent(Singer singer) {
		this.singer = singer;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("演出前商谈");
		// 这里切记 invoke 的对象不是 target 而是 入参proxy
		// 入参proxy 是生成的代理对象实例, 调用其method会被代理到invoke方法, 从而导致循环调用, 堆栈溢出
		Object result = method.invoke(singer, args);
		System.out.println("演出后分收钱");
		return result;
	}

	public static Singer getProxy(Singer singer) {
		return (Singer) Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), new SingerAgent(singer));
	}


}
