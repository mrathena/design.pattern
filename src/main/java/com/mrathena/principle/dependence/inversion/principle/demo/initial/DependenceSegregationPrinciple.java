package com.mrathena.principle.dependence.inversion.principle.demo.initial;

/**
 * @author mrathena on 2019-11-21 23:11
 */
public class DependenceSegregationPrinciple {
	public static void main(String[] args) {
		User user = new User();
		user.send(new Email());
	}
}

class Email {
	public void send() {
		System.out.println("send a email message");
	}
}

class User {
	public void send(Email email) {
		email.send();
	}
}
