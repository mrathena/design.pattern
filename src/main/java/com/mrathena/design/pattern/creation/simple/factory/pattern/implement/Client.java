package com.mrathena.design.pattern.creation.simple.factory.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:20
 */
public class Client {

	public static void main(String[] args) {
		Product a = Factory.getProduct("A");
		System.out.println(a);
		Product b = Factory.getProduct("B");
		System.out.println(b);

		Product a2 = Factory.getProductByClassName("com.mrathena.design.pattern.creation.simple.factory.pattern.implement.ConcreteProductA");
		System.out.println(a2);
		Product b2 = Factory.getProductByClassName("com.mrathena.design.pattern.creation.simple.factory.pattern.implement.ConcreteProductB");
		System.out.println(b2);
	}

}
