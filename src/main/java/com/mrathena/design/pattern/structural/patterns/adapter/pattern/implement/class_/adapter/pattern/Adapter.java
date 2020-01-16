package com.mrathena.design.pattern.structural.patterns.adapter.pattern.implement.class_.adapter.pattern;

/**
 * @author mrathena on 2020/1/16 15:35
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void bar() {
		System.out.println("before foo");
		super.foo();
		System.out.println("after foo");
	}

}
