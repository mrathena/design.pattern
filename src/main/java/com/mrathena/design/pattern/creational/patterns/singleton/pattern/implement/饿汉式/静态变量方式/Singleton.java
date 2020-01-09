package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.饿汉式.静态变量方式;

import java.io.Serializable;

/**
 * @author mrathena on 2020-01-06 21:52
 */
public class Singleton implements Serializable {

	private Singleton () {}

	private static Singleton instance;

	static {
		instance = new Singleton();
	}

	/**
	 * 可用,但可能浪费内存
	 */
	public static Singleton getInstance() {
		return instance;
	}

}