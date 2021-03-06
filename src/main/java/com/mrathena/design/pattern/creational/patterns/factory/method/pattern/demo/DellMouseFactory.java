package com.mrathena.design.pattern.creational.patterns.factory.method.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:15
 */
public class DellMouseFactory extends AbstractMouseFactory {
	@Override
	public AbstractMouse getMouse() {
		return new DellMouse();
	}
}
