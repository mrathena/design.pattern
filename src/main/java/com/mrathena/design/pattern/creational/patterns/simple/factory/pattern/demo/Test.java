package com.mrathena.design.pattern.creational.patterns.simple.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:11
 */
public class Test {

	public static void main(String[] args) {

		AbstractMouse product = MouseFactory.getMouse("DELL");
		System.out.println(product);

		product = MouseFactory.getMouse("ASUS");
		System.out.println(product);

	}

}
