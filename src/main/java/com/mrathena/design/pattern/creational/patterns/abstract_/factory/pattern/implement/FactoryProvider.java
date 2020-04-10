package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.implement;

/**
 * @author mrathena on 2020/4/10 16:09
 */
public class FactoryProvider {

	public static AbstractFactory getFactory(String factoryName) {
		switch (factoryName) {
			case "A":
				return new ConcreteFactoryA();
			case "B":
				return new ConcreteFactoryB();
			default:
				break;
		}
		return null;
	}

}
