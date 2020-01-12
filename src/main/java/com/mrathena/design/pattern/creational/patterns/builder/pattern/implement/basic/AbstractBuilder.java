package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.basic;

/**
 * @author mrathena on 2020/1/12 16:42
 */
public abstract class AbstractBuilder {

	protected Product product = new Product();

	public abstract void createHead();

	public abstract void createBody();

	public Product getProduct() {
		return product;
	}

}
