package com.mrathena.设计模式.创建型.单例模式.实现.静态内部类;

/**
 * @author mrathena on 2020-01-06 22:12
 */
public class Singleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}

	private Singleton () {}

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
