package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.basic;

/**
 * @author mrathena on 2020/1/12 16:42
 */
abstract public class AbstractBuilder {

	protected Product product = new Product();

	abstract public void buildHead();

	abstract public void buildBody();

	abstract public void buildFoot();

	public Product build() {
		return product;
	}

}
