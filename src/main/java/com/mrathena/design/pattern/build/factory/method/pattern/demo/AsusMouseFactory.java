package com.mrathena.design.pattern.build.factory.method.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:16
 */
public class AsusMouseFactory extends AbstractMouseFactory {
	@Override
	public AbstractMouse getMouse() {
		return new AsusMouse();
	}
}
