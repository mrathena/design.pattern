package com.mrathena.design.pattern.creation.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:41
 */
public class ConcreteFactoryA implements Factory {
	@Override
	public Product create() {
		return new ConcreteProductA();
	}
}
