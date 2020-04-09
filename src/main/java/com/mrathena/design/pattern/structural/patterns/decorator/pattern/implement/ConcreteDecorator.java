package com.mrathena.design.pattern.structural.patterns.decorator.pattern.implement;

/**
 * @author mrathena on 2020/4/9 14:44
 */
public class ConcreteDecorator extends AbstractDecorator {

	public ConcreteDecorator(Decoratee decoratee) {
		this.decoratee = decoratee;
	}

	@Override
	public void method() {
		decoratee.method();
		System.out.println("concrete method");
	}

}
