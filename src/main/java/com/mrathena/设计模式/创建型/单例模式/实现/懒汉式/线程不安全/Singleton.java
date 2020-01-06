package com.mrathena.设计模式.创建型.单例模式.实现.懒汉式.线程不安全;

/**
 * @author mrathena on 2020-01-06 22:02
 */
public class Singleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}

	private Singleton () {}

	private static Singleton instance;

	/**
	 * 不可用,线程不安全
	 */
	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

}
