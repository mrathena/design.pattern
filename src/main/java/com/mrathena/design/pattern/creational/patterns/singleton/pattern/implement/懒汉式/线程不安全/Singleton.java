package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.懒汉式.线程不安全;

/**
 * @author mrathena on 2020-01-06 22:02
 */
public class Singleton {

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
