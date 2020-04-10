package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.implement;

/**
 * @author mrathena on 2020/1/8 15:13
 */
public class Test {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProvider.getFactory("A");
		AbstractProduct1 productA = factory.getProduct1();
		AbstractProduct2 productB = factory.getProduct2();
		System.out.println(productA);
		System.out.println(productB);

		factory = FactoryProvider.getFactory("B");
		productA = factory.getProduct1();
		productB = factory.getProduct2();
		System.out.println(productA);
		System.out.println(productB);

	}

}
