package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.懒汉式.线程安全;

/**
 * @author mrathena on 2020/1/9 12:20
 */
public class Client {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}

}
