package com.mrathena.design.pattern.build.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:42
 */
public class Client {

	public static void main(String[] args) {
		AbstractProduct product = new ConcreteFactoryA().getProduct();
		System.out.println(product);
		System.out.println(new ConcreteFactoryB().getProduct());
	}

}
