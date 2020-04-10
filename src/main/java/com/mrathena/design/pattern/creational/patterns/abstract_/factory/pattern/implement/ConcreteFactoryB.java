package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.implement;

/**
 * @author mrathena on 2020/4/10 16:05
 */
public class ConcreteFactoryB extends AbstractFactory {

	@Override
	public AbstractProduct1 getProduct1() {
		return new ConcreteProductB1();
	}

	@Override
	public AbstractProduct2 getProduct2() {
		return new ConcreteProductB2();
	}
}
