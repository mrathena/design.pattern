package com.mrathena.design.pattern.structural.patterns.decorator.pattern.implement;

/**
 * @author mrathena on 2020/4/9 14:44
 */
public class ConcreteBeforeAfterDecorator extends AbstractDecorator {

	public ConcreteBeforeAfterDecorator(Decoratee decoratee) {
		this.decoratee = decoratee;
	}

	@Override
	public void method() {
		System.out.println("concrete before method");
		decoratee.method();
		System.out.println("concrete after method");
	}

}
