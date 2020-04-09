package com.mrathena.design.pattern.structural.patterns.decorator.pattern.implement;

/**
 * @author mrathena on 2020/4/9 14:38
 */
public class ConcreteDecoratee implements Decoratee {

	@Override
	public void method() {
		System.out.println("this is a concrete decoratee");
	}

}
