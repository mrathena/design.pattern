package com.mrathena.design.pattern.creational.patterns.factory.method.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:16
 */
public class Test {

	public static void main(String[] args) {

		AbstractMouseFactory factory = MouseFactoryProvider.getMouseFactory("DELL");
		AbstractMouse product = factory.getMouse();
		System.out.println(product);

		factory = MouseFactoryProvider.getMouseFactory("ASUS");
		product = factory.getMouse();
		System.out.println(product);

	}

}
