package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.静态内部类;

import java.io.Serializable;

/**
 * @author mrathena on 2020-01-06 22:12
 */
public class Singleton implements Serializable {

	private Singleton () {
		// 虽然提示存在问题,但是可以防反射
		if (null != InnerSingleton.INSTANCE) {
			throw new RuntimeException();
		}
	}

	/**
	 * 底层代码判断如果这个类重写了这个方法就会应用方法内部的实例,而不去反序列化一个新的实例
	 */
	private Object readResolve(){
		return InnerSingleton.INSTANCE;
	}

	private static class InnerSingleton {
		private static final Singleton INSTANCE = new Singleton();
	}

	/**
	 * 推荐
	 * Singleton被装载的时候,InnerSingleton并不会被装载
	 * 类的静态属性只会在类第一次加载的时候初始化,jvm帮我们保证了线程的安全性
	 * 只有调用Singleton.getInstance()的时候,InnerSingleton才会被装载,且只会被装载一次,且是线程安全的
	 */
	public static Singleton getInstance() {
		return InnerSingleton.INSTANCE;
	}

}
