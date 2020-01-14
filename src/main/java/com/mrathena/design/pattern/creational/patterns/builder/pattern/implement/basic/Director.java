package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.basic;

/**
 * @author mrathena on 2020/1/12 17:36
 */
public class Director {

	private AbstractBuilder builder;

	public Director(AbstractBuilder builder) {
		this.builder = builder;
	}

	public Product getProduct() {
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		return builder.build();
	}

}
