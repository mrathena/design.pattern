package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.optimize;

/**
 * @author mrathena on 2020/1/12 18:12
 */
public class Client {

	public static void main(String[] args) {
		Product product = new Product.ProductBuilder("head", "body").foot("foot").build();
		System.out.println(product);
	}

}
