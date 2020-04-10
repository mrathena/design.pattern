package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.implement;

/**
 * @author mrathena on 2020/4/10 16:05
 */
public class ConcreteFactoryA extends AbstractFactory {

	@Override
	public AbstractProduct1 getProduct1() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProduct2 getProduct2() {
		return new ConcreteProductA2();
	}
}
