package com.mrathena.设计模式.创建型.单例模式.实现.双重检查;

/**
 * @author mrathena on 2020-01-06 22:10
 */
public class Singleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}

	private Singleton () {}

	private static volatile Singleton instance;

	/**
	 * 推荐
	 */
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
