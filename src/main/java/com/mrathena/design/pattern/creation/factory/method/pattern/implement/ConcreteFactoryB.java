package com.mrathena.design.pattern.creation.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:42
 */
public class ConcreteFactoryB implements Factory {
	@Override
	public Product create() {
		return new ConcreteProductB();
	}
}
