package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:29
 */
public class PeripheralFactoryProvider {

	public static AbstractPeripheralFactory getPeripheralFactory(String brand) {
		switch (brand) {
			case "DELL":
				return new DellPeripheralFactory();
			case "ASUS":
				return new AsusPeripheralFactory();
			default:
				break;
		}
		return null;
	}

}
