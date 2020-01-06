package com.mrathena.设计模式.创建型.单例模式.实现.饿汉式.静态常量方式;

/**
 * @author mrathena on 2020-01-06 21:55
 */
public class Singleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}

	private Singleton () {}

	private static final Singleton INSTANCE = new Singleton();

	/**
	 * 可用,但可能浪费内存
	 */
	public static Singleton getInstance() {
		return INSTANCE;
	}

}
