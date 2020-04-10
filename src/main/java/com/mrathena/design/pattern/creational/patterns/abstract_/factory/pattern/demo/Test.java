package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:34
 */
public class Test {

	public static void main(String[] args) {

		AbstractPeripheralFactory factory = PeripheralFactoryProvider.getPeripheralFactory("DELL");
		AbstractMouse productMouse = factory.getMouse();
		AbstractKeyboard productKeyboard = factory.getKeyboard();
		System.out.println(productMouse);
		System.out.println(productKeyboard);

		factory = PeripheralFactoryProvider.getPeripheralFactory("ASUS");
		productMouse = factory.getMouse();
		productKeyboard = factory.getKeyboard();
		System.out.println(productMouse);
		System.out.println(productKeyboard);

	}

}
