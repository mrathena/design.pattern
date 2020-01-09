package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:33
 */
public class AsusPeripheralFactory extends AbstractPeripheralFactory {
	@Override
	public AbstractMouse getMouse() {
		return new AsusMouse();
	}

	@Override
	public AbstractKeyboard getKeyboard() {
		return new AsusKeyboard();
	}
}
