package com.mrathena.design.pattern.creational.patterns.simple.factory.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:20
 */
public class Test {

	public static void main(String[] args) {

		AbstractProduct product = Factory.getProduct("1");
		System.out.println(product);
		product = Factory.getProduct("2");
		System.out.println(product);

		product = Factory.getProductByClassName("com.mrathena.design.pattern.creational.patterns.simple.factory.pattern.implement.ConcreteProduct1");
		System.out.println(product);
		product = Factory.getProductByClassName("com.mrathena.design.pattern.creational.patterns.simple.factory.pattern.implement.ConcreteProduct2");
		System.out.println(product);

	}

}
