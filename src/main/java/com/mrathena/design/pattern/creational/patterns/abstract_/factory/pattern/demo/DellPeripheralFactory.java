package com.mrathena.design.pattern.creational.patterns.abstract_.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:32
 */
public class DellPeripheralFactory extends AbstractPeripheralFactory {

	@Override
	public AbstractMouse getMouse() {
		return new DellMouse();
	}

	@Override
	public AbstractKeyboard getKeyboard() {
		return new DellKeyboard();
	}

}
