package com.mrathena.design.pattern.creational.patterns.prototype.pattern.implement;

/**
 * @author mrathena on 2020-01-08 23:29
 */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		Product product = new Product("name", 1, user);
		Object clone = product.clone();
		System.out.println(product);
		System.out.println(clone);
		Product deepClone = product.deepClone();
		System.out.println(deepClone);
	}

}
