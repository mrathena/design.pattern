package com.mrathena.design.pattern.build.abstract_.factory.pattern.demo;

/**
 * 外设工厂
 *
 * @author mrathena on 2020/1/8 18:22
 */
public abstract class AbstractPeripheralFactory {

	abstract AbstractMouse getMouse();

	abstract AbstractKeyboard getKeyboard();

}
