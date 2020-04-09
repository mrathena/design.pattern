package com.mrathena.design.pattern.structural.patterns.decorator.pattern.implement;

/**
 * @author mrathena on 2020/4/9 15:13
 */
public class Test {

	public static void main(String[] args) {

		Decoratee decoratee = new ConcreteDecoratee();
		decoratee.method();

		System.out.println();

		decoratee = new ConcreteDecorator(new ConcreteDecoratee());
		decoratee.method();

		System.out.println();

		decoratee = new ConcreteBeforeDecorator(new ConcreteDecorator(new ConcreteAfterDecorator(new ConcreteDecoratee())));
		decoratee.method();

		System.out.println();

		decoratee = new ConcreteBeforeAfterDecorator(new ConcreteDecoratee());
		decoratee.method();

	}

}
