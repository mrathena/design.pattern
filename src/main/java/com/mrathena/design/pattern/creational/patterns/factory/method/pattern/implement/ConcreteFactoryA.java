package com.mrathena.design.pattern.creational.patterns.factory.method.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:41
 */
public class ConcreteFactoryA extends AbstractFactory {
	@Override
	public AbstractProduct getProduct() {
		return new ConcreteProductA();
	}
}
