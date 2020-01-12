package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.basic;

/**
 * @author mrathena on 2020/1/12 17:43
 */
public class Client {

	public static void main(String[] args) {
		Director director = new Director(new ConcreteBuilder());
		System.out.println(director.getProduct());
	}

}
