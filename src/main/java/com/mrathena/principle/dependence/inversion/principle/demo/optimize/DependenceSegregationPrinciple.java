package com.mrathena.principle.dependence.inversion.principle.demo.optimize;

/**
 * @author mrathena on 2019-11-21 23:13
 */
public class DependenceSegregationPrinciple {
	public static void main(String[] args) {
		User user = new User();
		user.send(new Email());
		user.send(new Wechat());
	}
}

interface Sender {
	void send();
}
class Email implements Sender {
	@Override
	public void send() {
		System.out.println("send a email message");
	}
}
class Wechat implements Sender {
	@Override
	public void send() {
		System.out.println("send a wechat message");
	}
}

class User {
	public void send(Sender sender) {
		sender.send();
	}
}