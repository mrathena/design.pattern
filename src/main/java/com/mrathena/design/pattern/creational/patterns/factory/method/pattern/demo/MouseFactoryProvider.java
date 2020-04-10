package com.mrathena.design.pattern.creational.patterns.factory.method.pattern.demo;


/**
 * @author mrathena on 2020/4/10 15:25
 */
public class MouseFactoryProvider {

	public static AbstractMouseFactory getMouseFactory(String brand) {
		switch (brand) {
			case "DELL":
				return new DellMouseFactory();
			case "ASUS":
				return new AsusMouseFactory();
			default:
				break;
		}
		return null;
	}

}
