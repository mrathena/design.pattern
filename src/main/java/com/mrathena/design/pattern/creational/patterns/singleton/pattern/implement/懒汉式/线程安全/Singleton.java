package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.懒汉式.线程安全;

/**
 * @author mrathena on 2020-01-06 22:04
 */
public class Singleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}

	private Singleton () {}

	private static Singleton instance;

	/**
	 * 不可用,线程安全,但性能低
	 */
	public static synchronized Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

}
