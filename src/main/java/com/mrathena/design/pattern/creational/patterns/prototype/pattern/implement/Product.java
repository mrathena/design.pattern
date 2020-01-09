package com.mrathena.design.pattern.creational.patterns.prototype.pattern.implement;

import java.io.*;

/**
 * @author mrathena on 2020-01-08 23:27
 */
public class Product implements Cloneable, Serializable {

	private String name;
	private int age;
	private User user;

	public Product() {}

	public Product(String name, int age, User user) {
		this.name = name;
		this.age = age;
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Product setAge(int age) {
		this.age = age;
		return this;
	}

	public User getUser() {
		return user;
	}

	public Product setUser(User user) {
		this.user = user;
		return this;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + "\':" + name.hashCode() +
				", age=" + age +
				", user=" + user + ":" + user.hashCode() +
				'}';
	}

	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product deepClone() {
		try (
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
		) {
			oos.writeObject(this);
			try (
					ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
					ObjectInputStream ois = new ObjectInputStream(bais);
			) {
				return (Product) ois.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
