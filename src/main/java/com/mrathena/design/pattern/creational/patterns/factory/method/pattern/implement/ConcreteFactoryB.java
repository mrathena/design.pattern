package com.mrathena.design.pattern.creational.patterns.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:42
 */
public class ConcreteFactoryB extends AbstractFactory {
	@Override
	public AbstractProduct getProduct() {
		return new ConcreteProductB();
	}
}
