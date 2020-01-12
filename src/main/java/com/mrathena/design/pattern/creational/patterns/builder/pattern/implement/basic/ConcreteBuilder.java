package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.basic;

/**
 * @author mrathena on 2020/1/12 16:45
 */
public class ConcreteBuilder extends AbstractBuilder {

	@Override
	public void createHead() {
		product.setHead("高达Head");
		System.out.println("第一步CreateHead");
	}

	@Override
	public void createBody() {
		product.setBody("高达Body");
		product.setArm("高达Arm");
		product.setLeg("高达Leg");
		product.setFoot("高达Foot");
		System.out.println("第二步CreatedBody");
	}

}
