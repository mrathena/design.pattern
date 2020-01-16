package com.mrathena.design.pattern.structural.patterns.adapter.pattern.implement.object.adapter.pattern;

/**
 * @author mrathena on 2020/1/16 15:35
 */
public class Adapter implements Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void bar() {
		System.out.println("before foo");
		adaptee.foo();
		System.out.println("after foo");
	}

}
