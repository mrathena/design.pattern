package com.mrathena.design.pattern.creation.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:42
 */
public class Client {

	public static void main(String[] args) {
		Product product = new ConcreteFactoryA().create();
		System.out.println(product);
		System.out.println(new ConcreteFactoryB().create());
	}

}
