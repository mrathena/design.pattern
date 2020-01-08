package com.mrathena.design.pattern.build.factory.method.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:16
 */
public class Client {

	public static void main(String[] args) {
		System.out.println(new DellMouseFactory().getMouse());
		System.out.println(new AsusMouseFactory().getMouse());
	}

}
