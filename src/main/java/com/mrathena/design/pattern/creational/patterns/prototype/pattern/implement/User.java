package com.mrathena.design.pattern.creational.patterns.prototype.pattern.implement;

import java.io.Serializable;

/**
 * @author mrathena on 2020-01-08 23:46
 */
public class User implements Serializable {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public User setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + "\':" + username.hashCode() +
				", password='" + password + "\':" + password.hashCode() +
				'}';
	}
}
