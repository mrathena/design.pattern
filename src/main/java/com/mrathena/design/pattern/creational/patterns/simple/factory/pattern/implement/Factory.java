package com.mrathena.design.pattern.creational.patterns.simple.factory.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:20
 */
public class Factory {

	public static AbstractProduct getProduct(String productName) {
		switch (productName) {
			case "1":
				return new ConcreteProduct1();
			case "2":
				return new ConcreteProduct2();
			default:
				break;
		}
		return null;
	}

	public static AbstractProduct getProductByClassName(String productClassName) {
		try {
			return (AbstractProduct) Class.forName(productClassName).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
