package com.mrathena.design.pattern.build.simple.factory.pattern.implement;

/**
 * @author mrathena on 2020/1/8 14:20
 */
public class Factory {

	public static Product getProduct(String productName) {
		switch (productName) {
			case "A":
				return new ConcreteProductA();
			case "B":
				return new ConcreteProductB();
			default:
				break;
		}
		return null;
	}

	public static Product getProductByClassName(String productClassName) {
		try {
			return (Product) Class.forName(productClassName).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
