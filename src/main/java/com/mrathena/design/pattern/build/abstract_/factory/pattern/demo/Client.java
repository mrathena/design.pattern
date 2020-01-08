package com.mrathena.design.pattern.build.abstract_.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:34
 */
public class Client {

	public static void main(String[] args) {
		AbstractPeripheralFactory dellFactory = PeripheralFactoryProvider.getPeripheralFactory("DELL");
		System.out.println(dellFactory.getMouse());
		System.out.println(dellFactory.getKeyboard());
		AbstractPeripheralFactory asusFactory = PeripheralFactoryProvider.getPeripheralFactory("ASUS");
		System.out.println(asusFactory.getMouse());
		System.out.println(asusFactory.getKeyboard());
	}

}
