package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.basic;

/**
 * @author mrathena on 2020/1/12 16:45
 */
public class ConcreteBuilder extends AbstractBuilder {

	@Override
	public void buildHead() {
		product.setHead("高达Head");
		System.out.println("buildHead");
	}

	@Override
	public void buildBody() {
		product.setBody("高达Body");
		product.setArm("高达Arm");
		product.setLeg("高达Leg");
		System.out.println("buildBody");
	}

	@Override
	public void buildFoot() {
		product.setFoot("高达Foot");
		System.out.println("buildFoot");
	}

}
