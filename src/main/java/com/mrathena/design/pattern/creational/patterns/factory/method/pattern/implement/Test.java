package com.mrathena.design.pattern.creational.patterns.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:42
 */
public class Test {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProvider.getFactory("A");
		AbstractProduct product = factory.getProduct();
		System.out.println(product);

		factory = FactoryProvider.getFactory("B");
		product = factory.getProduct();
		System.out.println(product);

	}

}
