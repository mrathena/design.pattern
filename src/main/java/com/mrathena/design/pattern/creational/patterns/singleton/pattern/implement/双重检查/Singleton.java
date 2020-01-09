package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.双重检查;

import java.io.Serializable;

/**
 * @author mrathena on 2020-01-06 22:10
 */
public class Singleton implements Serializable {

	private Singleton () {}

	private static volatile Singleton instance;

	public static Singleton getInstance() {
		if (null == instance) {
			synchronized (Singleton.class) {
				if (null == instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
